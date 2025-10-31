package com.bychaves.maratonajava.javacore.Bintroducaometodos.test;

import com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.dividirDoisNumeros01(20,0));
        System.out.println("--------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);

    }
}
