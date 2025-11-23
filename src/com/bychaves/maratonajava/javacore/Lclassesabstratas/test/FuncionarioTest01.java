package com.bychaves.maratonajava.javacore.Lclassesabstratas.test;

import com.bychaves.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.bychaves.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
        gerente.imprime();
    }
}
