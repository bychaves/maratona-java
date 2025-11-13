package com.bychaves.maratonajava.javacore.Gassociacao.test;

import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Aluno;
import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Local;
import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Professor;
import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Vila do Chaves, 8");
        Aluno aluno = new Aluno("Chaves", 14);
        Professor professor = new Professor("Girafales", "Programação");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Seminário de Boas Maneiras", alunos, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();

    }
}
