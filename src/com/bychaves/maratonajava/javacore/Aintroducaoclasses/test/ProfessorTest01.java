package com.bychaves.maratonajava.javacore.Aintroducaoclasses.test;

import com.bychaves.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Girafales";
        professor.idade = 27;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " \nIdade: " + professor.idade + " \nSexo: " + professor.sexo);
    }
}
