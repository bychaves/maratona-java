package com.bychaves.maratonajava.javacore.Npolimorfismo.test;

import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.bychaves.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000 );

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
