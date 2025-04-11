package com.example.compi;


import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.IOException;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Simbolo {
    String tipo;
    String valor;
    int linea;

    Simbolo(String tipo, String valor, int linea) {
        this.tipo = tipo;
        this.valor = valor;
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Valor: " + valor + ", Línea: " + linea;
    }
}

class ErrorLexico {
    String mensaje;
    int linea;
    int columna;

    ErrorLexico(String mensaje, int linea, int columna) {
        this.mensaje = mensaje;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Error en línea " + linea + ", columna " + columna + ": " + mensaje;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("src/main/resources/input.txt");

            // Analizador léxico
            TheLexerLexer lexer = new TheLexerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Definimos la tabla de símbolos y los errores léxicos
            Map<String, Simbolo> tablaSimbolos = new HashMap<>();
            List<ErrorLexico> erroresLexicos = new ArrayList<>();

            // Agregamos un error listener para capturar errores léxicos
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    erroresLexicos.add(new ErrorLexico(msg, line, charPositionInLine));
                }
            });

            // Llenamos la lista de tokens
            tokens.fill();
            for (Token token : tokens.getTokens()) {
                String tokenTexto = token.getText();
                String tokenTipo = TheLexerLexer.VOCABULARY.getSymbolicName(token.getType());
                int tokenLinea = token.getLine();

                if (tokenTipo == null) continue; // Evitar procesar tokens inválidos

                // Clasificamos los tokens y los agregamos a la tabla de símbolos
                if (tokenTipo.equals("IDENTIFIER")) {
                    tablaSimbolos.put(tokenTexto, new Simbolo("Variable", tokenTexto, tokenLinea));
                } else if (tokenTipo.equals("INT_CONST")) {
                    tablaSimbolos.put(tokenTexto, new Simbolo("Constante", tokenTexto, tokenLinea));
                } else if (tokenTipo.matches("PLUS|MINUS|MULT|DIV")) {
                    tablaSimbolos.put(tokenTexto, new Simbolo("Operador", tokenTexto, tokenLinea));
                } else if (tokenTipo.matches("IF|ELSE|FOR|PRINT|INT|BFHJK")) {
                    tablaSimbolos.put(tokenTexto, new Simbolo("Palabra reservada", tokenTexto, tokenLinea));
                }

                // Mostramos cada token
                System.out.println(tokenTexto + " -> " + tokenTipo);
            }

            // Mostramos la tabla de símbolos
            System.out.println("\nTabla de Símbolos:");
            for (Map.Entry<String, Simbolo> entry : tablaSimbolos.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            // Mostramos los errores léxicos si hay
            System.out.println("\nErrores Léxicos:");
            for (ErrorLexico error : erroresLexicos) {
                System.out.println(error);
            }

            // Ahora analizamos la sintaxis utilizando el parser
            TheLexerParser parser = new TheLexerParser(tokens);
            ParseTree tree = parser.program(); // Ajusta a tu regla principal

            // Creamos la ventana para mostrar el árbol sintáctico
            JFrame frame = new JFrame("Árbol Sintáctico");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            frame.add(viewer);
            frame.setSize(800, 600);
            frame.setVisible(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
