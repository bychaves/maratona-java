package com.bychaves.maratonajava.javacore.Aintroducaoclasses.test;

import com.bychaves.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.sexo = 'M';
        professor.idade = 100;

        System.out.println("Nome: " + professor.nome);
        System.out.println("Sexo: " + professor.sexo + "asculino");
        System.out.println("Idade: " + professor.idade);
    }
}
