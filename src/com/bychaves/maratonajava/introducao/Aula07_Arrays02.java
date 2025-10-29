package com.bychaves.maratonajava.introducao;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double: 0
        // char '\u0000': ' '
        // String: null
        // boolean: false

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
