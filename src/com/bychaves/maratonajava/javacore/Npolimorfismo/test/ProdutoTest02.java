package com.bychaves.maratonajava.javacore.Npolimorfismo.test;

import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.bychaves.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
