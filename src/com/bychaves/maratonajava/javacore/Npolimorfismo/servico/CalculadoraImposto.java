package com.bychaves.maratonajava.javacore.Npolimorfismo.servico;

import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Validade do produto: " + tomate.getDataValidade());
        }
    }
}
