"""Analizador sintáctico y evaluador de expresiones aritméticas escrito en Python.

Este módulo implementa un analizador descendente recursivo que reproduce la
funcionalidad del analizador generado con ANTLR para Java, pero utilizando solo
la biblioteca estándar de Python. Permite validar y evaluar expresiones
aritméticas separadas por punto y coma.
"""
from __future__ import annotations

from dataclasses import dataclass
from typing import Iterator, List, Optional, Sequence


class AnalizadorError(Exception):
    """Clase base para los errores del analizador."""


class ErrorLexico(AnalizadorError):
    """Señala un símbolo inesperado durante el análisis léxico."""


class ErrorSintactico(AnalizadorError):
    """Señala un token inesperado durante el análisis sintáctico."""


@dataclass(frozen=True)
class Token:
    tipo: str
    lexema: str
    linea: int
    columna: int

    def __repr__(self) -> str:  # pragma: no cover - útil para depuración
        return f"Token({self.tipo!r}, {self.lexema!r}, linea={self.linea}, columna={self.columna})"


class Lexer:
    """Genera tokens a partir del texto de entrada."""

    _ESPACIOS = {" ", "\t", "\r", "\n"}

    def __init__(self, texto: str) -> None:
        self._texto = texto
        self._indice = 0
        self._linea = 1
        self._columna = 1

    def generar_tokens(self) -> Iterator[Token]:
        while not self._terminado:
            caracter = self._texto[self._indice]

            if caracter in self._ESPACIOS:
                self._avanzar_espacios()
                continue

            if caracter.isdigit():
                yield self._token_numero()
                continue

            if caracter == "+":
                yield self._crear_token("MAS", "+")
            elif caracter == "-":
                yield self._crear_token("MENOS", "-")
            elif caracter == "*":
                yield self._crear_token("MULT", "*")
            elif caracter == "/":
                yield self._crear_token("DIV", "/")
            elif caracter == "(":
                yield self._crear_token("PAR_IZQ", "(")
            elif caracter == ")":
                yield self._crear_token("PAR_DER", ")")
            elif caracter == ";":
                yield self._crear_token("PUNTO_COMA", ";")
            else:
                raise ErrorLexico(
                    f"Símbolo inesperado {caracter!r} en línea {self._linea}, columna {self._columna}"
                )

        yield Token("EOF", "", self._linea, self._columna)

    @property
    def _terminado(self) -> bool:
        return self._indice >= len(self._texto)

    def _avanzar(self, cantidad: int = 1) -> None:
        for _ in range(cantidad):
            if self._terminado:
                return
            caracter = self._texto[self._indice]
            self._indice += 1
            if caracter == "\n":
                self._linea += 1
                self._columna = 1
            else:
                self._columna += 1

    def _avanzar_espacios(self) -> None:
        while not self._terminado and self._texto[self._indice] in self._ESPACIOS:
            self._avanzar()

    def _crear_token(self, tipo: str, lexema: str) -> Token:
        token = Token(tipo, lexema, self._linea, self._columna)
        self._avanzar()
        return token

    def _token_numero(self) -> Token:
        inicio_indice = self._indice
        inicio_columna = self._columna

        while not self._terminado and self._texto[self._indice].isdigit():
            self._avanzar()

        if not self._terminado and self._texto[self._indice] == ".":
            self._avanzar()
            if self._terminado or not self._texto[self._indice].isdigit():
                raise ErrorLexico(
                    f"Se esperaba al menos un dígito después del punto decimal en línea {self._linea}, columna {self._columna}"
                )
            while not self._terminado and self._texto[self._indice].isdigit():
                self._avanzar()
            tipo = "NUM_REAL"
        else:
            tipo = "NUM_ENTERO"

        lexema = self._texto[inicio_indice:self._indice]
        return Token(tipo, lexema, self._linea, inicio_columna)


@dataclass
class Nodo:
    pass


@dataclass
class Numero(Nodo):
    valor: float


@dataclass
class OperacionBinaria(Nodo):
    operador: str
    izquierda: Nodo
    derecha: Nodo


@dataclass
class OperacionUnaria(Nodo):
    operador: str
    operando: Nodo


class Parser:
    """Implementa un analizador descendente recursivo."""

    def __init__(self, tokens: Sequence[Token]) -> None:
        self._tokens = tokens
        self._posicion = 0

    def parsear(self) -> List[Nodo]:
        instrucciones: List[Nodo] = []
        while not self._coincide("EOF"):
            if self._coincide("PUNTO_COMA"):
                continue
            expresion = self._expresion()
            self._consumir("PUNTO_COMA", "Se esperaba ';' al final de la expresión")
            instrucciones.append(expresion)
        return instrucciones

    def _expresion(self) -> Nodo:
        nodo = self._termino()
        while True:
            if self._coincide("MAS"):
                nodo = OperacionBinaria("+", nodo, self._termino())
            elif self._coincide("MENOS"):
                nodo = OperacionBinaria("-", nodo, self._termino())
            else:
                break
        return nodo

    def _termino(self) -> Nodo:
        nodo = self._factor()
        while True:
            if self._coincide("MULT"):
                nodo = OperacionBinaria("*", nodo, self._factor())
            elif self._coincide("DIV"):
                nodo = OperacionBinaria("/", nodo, self._factor())
            else:
                break
        return nodo

    def _factor(self) -> Nodo:
        if self._coincide("MAS"):
            return OperacionUnaria("+", self._factor())
        if self._coincide("MENOS"):
            return OperacionUnaria("-", self._factor())

        if self._coincide("NUM_ENTERO"):
            return Numero(float(self._anterior().lexema))
        if self._coincide("NUM_REAL"):
            return Numero(float(self._anterior().lexema))
        if self._coincide("PAR_IZQ"):
            expresion = self._expresion()
            self._consumir("PAR_DER", "Se esperaba ')' para cerrar la expresión")
            return expresion

        token = self._actual()
        raise ErrorSintactico(
            f"Token inesperado {token.lexema!r} en línea {token.linea}, columna {token.columna}"
        )

    def _coincide(self, *tipos: str) -> bool:
        for tipo in tipos:
            if self._verificar(tipo):
                self._avanzar()
                return True
        return False

    def _consumir(self, tipo: str, mensaje: str) -> Token:
        if self._verificar(tipo):
            return self._avanzar()
        token = self._actual()
        raise ErrorSintactico(f"{mensaje}. Se encontró {token.lexema!r} en línea {token.linea}, columna {token.columna}")

    def _verificar(self, tipo: str) -> bool:
        if self._es_fin():
            return tipo == "EOF"
        return self._actual().tipo == tipo

    def _avanzar(self) -> Token:
        if not self._es_fin():
            self._posicion += 1
        return self._anterior()

    def _anterior(self) -> Token:
        return self._tokens[self._posicion - 1]

    def _actual(self) -> Token:
        return self._tokens[self._posicion]

    def _es_fin(self) -> bool:
        return self._actual().tipo == "EOF"


def evaluar(nodo: Nodo) -> float:
    """Evalúa un nodo del AST y devuelve el resultado numérico."""
    if isinstance(nodo, Numero):
        return nodo.valor
    if isinstance(nodo, OperacionUnaria):
        valor = evaluar(nodo.operando)
        return valor if nodo.operador == "+" else -valor
    if isinstance(nodo, OperacionBinaria):
        izquierda = evaluar(nodo.izquierda)
        derecha = evaluar(nodo.derecha)
        if nodo.operador == "+":
            return izquierda + derecha
        if nodo.operador == "-":
            return izquierda - derecha
        if nodo.operador == "*":
            return izquierda * derecha
        if nodo.operador == "/":
            if derecha == 0:
                raise ZeroDivisionError("División entre cero detectada")
            return izquierda / derecha
    raise TypeError(f"Nodo no soportado: {type(nodo).__name__}")


def analizar_texto(texto: str) -> List[float]:
    """Analiza y evalúa todas las expresiones presentes en el texto recibido."""
    lexer = Lexer(texto)
    tokens = list(lexer.generar_tokens())
    parser = Parser(tokens)
    arboles = parser.parsear()
    resultados = [evaluar(arbol) for arbol in arboles]
    return [_normalizar_resultado(valor) for valor in resultados]


def _normalizar_resultado(valor: float) -> float | int:
    if float(valor).is_integer():
        return int(valor)
    return valor


def analizar_archivo(ruta: str) -> List[float]:
    """Lee y analiza un archivo que contiene expresiones aritméticas."""
    from pathlib import Path

    contenido = Path(ruta).read_text(encoding="utf-8")
    return analizar_texto(contenido)


def main(argv: Optional[Sequence[str]] = None) -> int:
    """Punto de entrada de línea de comandos."""
    import argparse
    import sys
    from pathlib import Path

    parser = argparse.ArgumentParser(
        description="Analizador de expresiones aritméticas implementado en Python."
    )
    parser.add_argument(
        "archivo",
        nargs="?",
        default="prueba_python.txt",
        help="Ruta al archivo que contiene las expresiones a analizar",
    )

    args = parser.parse_args(argv)
    ruta = Path(args.archivo)

    if not ruta.exists():
        sys.stderr.write(f"No se encontró el archivo {ruta}\n")
        return 1

    try:
        resultados = analizar_archivo(str(ruta))
    except AnalizadorError as exc:
        sys.stderr.write(f"Error de análisis: {exc}\n")
        return 1
    except ZeroDivisionError as exc:
        sys.stderr.write(f"Error de ejecución: {exc}\n")
        return 1

    for indice, valor in enumerate(resultados, start=1):
        sys.stdout.write(f"Expresión {indice}: {valor}\n")
    sys.stdout.write("Análisis terminado con éxito.\n")
    return 0


if __name__ == "__main__":  # pragma: no cover - ejecución directa
    raise SystemExit(main())
