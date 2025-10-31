package com.bychaves.maratonajava.javacore.Aintroducaoclasses.test;

import com.bychaves.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Jeep";
        carro1.modelo = "Compass";
        carro1.ano = 2025;

        carro2.nome = "Corolla";
        carro2.modelo = "SUV";
        carro2.ano = 2025;

        carro1 = carro2; // Aula Referencia de objetos

        System.out.println("Carro 1 \nNome: " + carro1.nome +
                "\nModelo: " + carro1.modelo +
                "\nAno: " + carro1.ano);

        System.out.println("\nCarro 2 \nNome: " + carro2.nome +
                "\nModelo: " + carro2.modelo +
                "\nAno: " + carro2.ano);
    }
}
