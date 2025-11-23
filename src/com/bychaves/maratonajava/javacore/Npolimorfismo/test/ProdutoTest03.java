package com.bychaves.maratonajava.javacore.Npolimorfismo.test;

import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.bychaves.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("30/12/2025");


        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
