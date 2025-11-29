package com.bychaves.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Gabriel"; // String constant pool
        String nome2 = "Gabriel";
        nome = nome.concat(" Chaves"); // nome += " Chaves"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Gabriel"); // 1: Criando uma variável de referência, 2: Criando um objeto do tipo String, 3: Uma String no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
