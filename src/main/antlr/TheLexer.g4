grammar TheLexer;

// ======================
//    Reglas del Parser
// ======================
@header {
    package com.example.compi.TheLezer;
}

program : statement* EOF;

statement
    : assignStmt
    | printStmt
    | ifStmt
    | forStmt
    ;

assignStmt : IDENTIFIER ASSIGN expr SEMI;

printStmt  : PRINT LPAREN expr RPAREN SEMI;

ifStmt     : IF LPAREN expr RPAREN LBRACE statement* RBRACE
             (ELSE LBRACE statement* RBRACE)?;

forStmt    : FOR LPAREN assignStmt expr SEMI assignStmt RPAREN LBRACE statement* RBRACE;

expr
    : relExpr
    ;

relExpr
    : arithExpr ( (GT | LT | GE | LE | EQ | NEQ) arithExpr )?
    ;

arithExpr
    : arithExpr (PLUS | MINUS) term    # addSub
    | term                            # toTerm
    ;

term
    : term (MULT | DIV) factor         # mulDiv
    | factor                           # toFactor
    ;

factor
    : INT_CONST
    | IDENTIFIER
    | STRING
    | LPAREN expr RPAREN
    ;

// ======================
//    Reglas del Lexer
// ======================

IF      : 'if';
ELSE    : 'else';
FOR     : 'for';
PRINT   : 'print';
INT     : 'int';

// Identificadores (máx. 15 caracteres)
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    {
        if (getText().length() > 15)
            throw new RuntimeException("Error: Identificador demasiado largo en línea " + getLine());
    }
    ;

INT_CONST
    : [0-9]+
    {
        if (Integer.parseInt(getText()) > 100)
            throw new RuntimeException("Error: Constante fuera de rango en línea " + getLine());
    }
    ;

// Nueva regla para cadenas de texto (strings)
STRING
    : '"' ( ~["\\] | '\\' . )* '"'
    ;

// Operadores aritméticos
PLUS  : '+';
MINUS : '-';
MULT  : '*';
DIV   : '/';

// Operador de asignación
ASSIGN : ':=';

// Operadores relacionales
GE    : '>=';
LE    : '<=';
GT    : '>';
LT    : '<';
EQ    : '=';
NEQ   : '<>';

// Caracteres especiales
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
SEMI   : ';';

// Ignorar espacios y saltos de línea
WS : [ \t\r\n]+ -> skip;
