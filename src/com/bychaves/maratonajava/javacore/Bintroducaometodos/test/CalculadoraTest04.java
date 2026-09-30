package com.bychaves.maratonajava.javacore.Bintroducaometodos.test;

import com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);


    }
}
