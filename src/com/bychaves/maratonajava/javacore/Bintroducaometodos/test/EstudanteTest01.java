package com.bychaves.maratonajava.javacore.Bintroducaometodos.test;

import com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante estudante = new ImpressoraEstudante();

        estudante01.nome = "Chaves";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Kiko";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        estudante.imprime(estudante01);

        estudante.imprime(estudante02);

        System.out.println("################");

        estudante.imprime(estudante01);

        estudante.imprime(estudante02);
    }


}
