from flask import Flask, render_template, request, jsonify
import sys
import os
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener

# Añadir la ruta de los archivos generados por ANTLR al path
sys.path.append(os.path.join(os.path.dirname(__file__), '../bin'))

# Importar las clases generadas por ANTLR
from Ejemplo3Lexer import Ejemplo3Lexer
from Ejemplo3Parser import Ejemplo3Parser
from Ejemplo3Listener import Ejemplo3Listener

# Clase para manejar errores de sintaxis
class SyntaxErrorListener(ErrorListener):
    def __init__(self):
        super(SyntaxErrorListener, self).__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"Error en línea {line}:{column} - {msg}")

    def getErrors(self):
        return self.errors

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/analyze', methods=['POST'])
def analyze():
    code = request.form['code']
    
    # Crear el analizador léxico
    input_stream = InputStream(code)
    lexer = Ejemplo3Lexer(input_stream)
    
    # Crear el listener de errores
    error_listener = SyntaxErrorListener()
    lexer.removeErrorListeners()
    lexer.addErrorListener(error_listener)
    
    # Crear el stream de tokens
    token_stream = CommonTokenStream(lexer)
    
    # Crear el parser
    parser = Ejemplo3Parser(token_stream)
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)
    
    # Ejecutar el análisis sintáctico
    try:
        tree = parser.inicio()
        
        # Verificar si hay errores
        if error_listener.getErrors():
            return jsonify({
                'success': False,
                'errors': error_listener.getErrors()
            })
        else:
            return jsonify({
                'success': True,
                'message': 'Análisis sintáctico completado con éxito!'
            })
    except Exception as e:
        return jsonify({
            'success': False,
            'errors': [str(e)]
        })

if __name__ == '__main__':
    app.run(debug=True)