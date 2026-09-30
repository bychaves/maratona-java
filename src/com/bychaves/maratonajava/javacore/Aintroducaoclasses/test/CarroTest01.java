package com.bychaves.maratonajava.javacore.Aintroducaoclasses.test;

import com.bychaves.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Jeep";
        carro.modelo = "SUV";
        carro.ano = 2026;

        carro1.nome = "Hilux";
        carro1.modelo = "Picape";
        carro1.ano = 2026;

        carro = carro1; // Referência de objetos

        System.out.println("Carro 1");

        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("-----------------------");

        System.out.println("Carro 2");

        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("-----------------------");
    }
}
