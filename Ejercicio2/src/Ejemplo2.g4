/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Ejemplo2;

/*
	Escribir un analizador sintáctico para los elementos del lenguaje C
        presentes en el siguiente ejemplo de codigo:

	while (a<b) {
		if(2*a>=b)
		{
		b=2;
		}
		a=a+1;
	}

	- Este ejemplo se usara tambien para demostrar la implementacion del manejo (conteo)
        de errores.
*/

/* Reglas de analisis lexico */

fragment LETRA 
	: 	'a'..'z'|'A'..'Z'
	;
	
fragment DIGITO 
	:	'0'..'9'
	;

NUM_REAL 	:	(DIGITO+ '.') DIGITO*
	;

NUM_ENTERO 	:	(DIGITO+)
	;

IDENT 	:	(LETRA|'_')(LETRA|DIGITO|'_')*
	;

OPERADOR 
	:	'=='|'<'|'>'|'<='|'>='
	;

BLANCO	:	 (' '|'\r'|'\n'|'\t')+ -> skip
	;

/* Reglas de analisis sintactico */

inicio 	:	'while' '(' expresion ')' '{' instrucciones '}'
	;

instrucciones 
	:	instruccion*
	;

instruccion 
	:	inst_asig
	|	inst_if
	;
	
inst_asig 
	:	IDENT '=' expresion ';'
	;

inst_if : 	'if' '(' expresion ')' '{' instrucciones '}'
	;

expresion 
	:	operacion (OPERADOR operacion)* 
	;

operacion 
	:	sumando (('+'|'-') sumando)*
	;

sumando 
	:	operador (('*'|'/') operador)*
	;

operador 	
	:	IDENT
	|	NUM_ENTERO
	|	NUM_REAL
	|	'(' expresion ')'
	;
