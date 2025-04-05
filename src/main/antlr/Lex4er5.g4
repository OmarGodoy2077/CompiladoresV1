grammar Lex4er5;

// ======================
//    Reglas del Parser
// ======================

// Regla principal que representa un programa completo
program : statement* EOF;

// Sentencias generales
statement
    : assignStmt
    | printStmt
    | ifStmt
    | forStmt
    ;

// Asignaciones
assignStmt : IDENTIFIER ASSIGN expr SEMI;

// Instrucción de impresión
printStmt  : PRINT LPAREN expr RPAREN SEMI;

// Condición IF
ifStmt     : IF LPAREN expr RPAREN LBRACE statement* RBRACE
             (ELSE LBRACE statement* RBRACE)?;

// Bucle FOR
forStmt    : FOR LPAREN assignStmt expr SEMI assignStmt RPAREN LBRACE statement* RBRACE;

// Expresiones matemáticas
expr : expr (PLUS | MINUS) expr
     | expr (MULT | DIV) expr
     | INT_CONST
     | IDENTIFIER
     | LPAREN expr RPAREN
     ;

// ======================
//    Reglas del Lexer
// ======================

// Identificadores (máx. 15 caracteres)
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]* { if (getText().length() > 15) notifyErrorListeners("Error: Identificador demasiado largo en línea " + getLine()); }
    ;

// Números enteros (0 - 100)
INT_CONST
    : [0-9]+ {
        if (Integer.parseInt(getText()) > 100) notifyErrorListeners("Error: Constante fuera de rango en línea " + getLine());
      }
    ;

// Palabras reservadas
IF      : 'if';
ELSE    : 'else';
FOR     : 'for';
PRINT   : 'print';
INT     : 'int';
BFHJK   : 'bfhjk';

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

// Tokens inválidos capturados
ERROR
    : . { notifyErrorListeners("Error: Símbolo no reconocido '" + getText() + "' en línea " + getLine()); }
    ;
