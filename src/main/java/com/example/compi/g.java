package com.example.compi;

import java.util.HashMap;

import java.util.HashMap;

import java.util.TreeMap;

public class g {
    public static void main(String[] args) {
        TreeMap<Integer, String> arbol = new TreeMap<>();

        // Insertar elementos en el árbol
        arbol.put(3, "Utopia");
        arbol.put(1, "Donda");
        arbol.put(5, "GNX");
        arbol.put(2, "After Hours");
        arbol.put(4, "DAMN.");

        // Mostrar el árbol en orden ascendente (ya ordenado por clave)
        System.out.println("Álbumes ordenados por ranking:");
        for (Integer clave : arbol.keySet()) {
            System.out.println(clave + " -> " + arbol.get(clave));
        }

        // Buscar un álbum en el árbol
        System.out.println("\nEl álbum en la posición 3 es: " + arbol.get(3));
    }
}
