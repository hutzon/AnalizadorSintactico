/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
grammar Ejemplo1;

/* Reglas de analisis lexico */

fragment NUEVA_LINEA 
	:	'\r\n'
	;

BLANCO 	:	(' '|'\t'|NUEVA_LINEA)+ -> skip
	;

fragment DIGITO 
	:	'0'..'9'
	;

NUM_REAL 	:	(DIGITO+ '.') DIGITO*
	;

NUM_ENTERO 	:	(DIGITO+)
	;

/* Reglas de analisis sintactico */	

instrucciones 
	:	(expresion ';')*
	;

expresion 
	:	expr_mult (('+'|'-') expr_mult)*
	;

expr_mult 
	:	expr_base (('*'|'/') expr_base)*
	;

expr_base 
	:	NUM_ENTERO
	|	NUM_REAL
	|	'(' expresion ')'
	;

