package com.bychaves.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salarios[i]);
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salarios == null) {
            return;
        }

        for (int i = 0; i < salarios.length; i++) {
            media += salarios[i];
        }
        double total = media / salarios.length;
        System.out.printf("Média Salarial: %.2f ", total);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
