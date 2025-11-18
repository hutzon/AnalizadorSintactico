"""Paquete con un analizador sintáctico manual implementado en Python."""

from importlib import import_module
from typing import Any

__all__ = [
    "AnalizadorError",
    "ErrorLexico",
    "ErrorSintactico",
    "analizar_archivo",
    "analizar_texto",
    "evaluar",
    "main",
]


def __getattr__(nombre: str) -> Any:
    if nombre in __all__:
        modulo = import_module(".analyzer", __name__)
        return getattr(modulo, nombre)
    raise AttributeError(f"módulo {__name__!r} no tiene el atributo {nombre!r}")


def __dir__() -> list[str]:  # pragma: no cover - para una mejor experiencia interactiva
    return sorted(__all__ + ["__doc__", "__all__"])
