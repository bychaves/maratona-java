package com.bychaves.maratonajava.javacore.Fmodificadorestatico.test;

import com.bychaves.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);        Carro carro1 = new Carro("GOL", 240);
        Carro carro2 = new Carro("BMW", 280);
        Carro carro3 = new Carro("Mercedes", 275);



        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
