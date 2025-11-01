/*
 * Gramática para el analizador sintáctico del Ejercicio 3
 */

grammar Ejemplo3;

/* Reglas de análisis léxico */

fragment LETRA 
    :   'a'..'z'|'A'..'Z'
    ;
    
fragment DIGITO 
    :   '0'..'9'
    ;

NUM_REAL    :   (DIGITO+ '.') DIGITO*
    ;

NUM_ENTERO  :   (DIGITO+)
    ;

IDENT   :   (LETRA|'_')(LETRA|DIGITO|'_')*
    ;

OPERADOR 
    :   '=='|'<'|'>'|'<='|'>='
    ;

BLANCO  :    (' '|'\r'|'\n'|'\t')+ -> skip
    ;

/* Reglas de análisis sintáctico */

inicio  :   'while' '(' expresion ')' '{' instrucciones '}'
    |   instrucciones
    ;

instrucciones 
    :   instruccion*
    ;

instruccion 
    :   inst_asig
    |   inst_if
    |   inst_while
    ;
    
inst_asig 
    :   IDENT '=' expresion ';'
    ;

inst_if :   'if' '(' expresion ')' '{' instrucciones '}'
    ;

inst_while : 'while' '(' expresion ')' '{' instrucciones '}'
    ;

expresion 
    :   operacion (OPERADOR operacion)* 
    ;

operacion 
    :   sumando (('+'|'-') sumando)*
    ;

sumando 
    :   operador (('*'|'/') operador)*
    ;

operador    
    :   IDENT
    |   NUM_ENTERO
    |   NUM_REAL
    |   '(' expresion ')'
    ;