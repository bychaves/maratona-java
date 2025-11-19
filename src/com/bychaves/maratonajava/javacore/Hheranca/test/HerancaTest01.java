package com.bychaves.maratonajava.javacore.Hheranca.test;

import com.bychaves.maratonajava.javacore.Hheranca.dominio.Endereco;
import com.bychaves.maratonajava.javacore.Hheranca.dominio.Funcionario;
import com.bychaves.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco endereco1 = new Endereco();

        endereco.setRua("Vila do chaves");
        endereco1.setRua("Vila da Chiquinha");
        endereco.setCep("88888-888");
        endereco1.setCep("99999-999");

        Pessoa pessoa = new Pessoa("Chaves", "111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Chiquinha" );
        funcionario.setCpf("222222");
        funcionario.setEndereco(endereco1);

        System.out.println("--------------------------");
        funcionario.imprime();

    }
}
