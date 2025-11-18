import unittest

from analizador_python import (
    AnalizadorError,
    ErrorLexico,
    ErrorSintactico,
    analizar_texto,
)


class AnalyzerTests(unittest.TestCase):
    def test_operaciones_basicas(self) -> None:
        expresiones = """
        1+2;
        3*4;
        """
        resultados = analizar_texto(expresiones)
        self.assertEqual(resultados, [3, 12])

    def test_precedencia_y_parentesis(self) -> None:
        expresiones = "(4+1)/2*5;"
        resultados = analizar_texto(expresiones)
        self.assertAlmostEqual(resultados[0], 12.5)

    def test_numeros_reales(self) -> None:
        expresiones = "3.5-1.2;"
        resultados = analizar_texto(expresiones)
        self.assertAlmostEqual(resultados[0], 2.3)

    def test_signos_unarios(self) -> None:
        expresiones = "-2*-3;"
        resultados = analizar_texto(expresiones)
        self.assertEqual(resultados[0], 6)

    def test_error_sin_punto_y_coma(self) -> None:
        expresiones = "1+2"
        with self.assertRaises(ErrorSintactico):
            analizar_texto(expresiones)

    def test_error_lexico(self) -> None:
        expresiones = "1 & 2;"
        with self.assertRaises(ErrorLexico):
            analizar_texto(expresiones)


if __name__ == "__main__":
    unittest.main()
