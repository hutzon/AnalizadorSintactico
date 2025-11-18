# Analizador en Python

Este directorio contiene una implementación manual del analizador léxico y
sintáctico de expresiones aritméticas usando Python puro. El comportamiento
reproduce al proyecto original en Java basado en ANTLR, pero añade la
posibilidad de evaluar cada expresión y mostrar su resultado.

## Requisitos

Solo se necesita Python 3.10 o superior (incluido en la mayoría de
distribuciones modernas). No requiere dependencias externas.

## Uso

```bash
python -m analizador_python.analyzer [ruta_al_archivo]
```

Si no se especifica una ruta, el programa leerá `prueba_python.txt`, que
incluye ejemplos de expresiones válidas.

La salida muestra el resultado numérico de cada expresión y un mensaje final
indicando que el análisis terminó con éxito. Ante cualquier error léxico o
sintáctico, el programa indica la posición del problema.

## Ejecución de pruebas

```bash
python -m unittest discover -s tests -p 'test_*.py'
```

Las pruebas unitarias validan los casos de uso principales y la detección de
errores.
