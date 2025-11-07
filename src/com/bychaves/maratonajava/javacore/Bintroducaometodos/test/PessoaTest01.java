package com.bychaves.maratonajava.javacore.Bintroducaometodos.test;

import com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Sr. Madruga");
        pessoa.setIdade(31);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
