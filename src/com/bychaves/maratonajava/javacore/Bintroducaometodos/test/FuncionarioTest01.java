package com.bychaves.maratonajava.javacore.Bintroducaometodos.test;

import com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Seu Barriga");
        funcionario.setSalarios(new double[]{1200, 987.35, 2000});
        funcionario.setIdade(32);
        funcionario.imprime();
    }
}
