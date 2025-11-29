package com.bychaves.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Goku";
        String numeros = "012345";

        // Retorna o caractere no índice 0 (no caso, o espaço antes de "Goku")
        System.out.println(nome.charAt(0));

        // Retorna o tamanho da String, contando inclusive os espaços
        System.out.println(nome.length());

        // Substitui todas as ocorrências de "o" por "ô" e retorna uma nova String
        System.out.println(nome.replace("o", "ô"));

        // Converte todos os caracteres para minúsculas
        System.out.println(nome.toLowerCase());

        // Converte todos os caracteres para maiúsculas
        System.out.println(nome.toUpperCase());

        // Retorna o tamanho da String "numeros"
        System.out.println(numeros.length());

        // Retorna uma substring a partir do índice 3 até o final
        // Em "012345", índice 3 é "3", então imprime "345"
        System.out.println(numeros.substring(3, numeros.length()));

        // Remove espaços no início e no fim da String
        System.out.println(nome.trim());
    }
}
