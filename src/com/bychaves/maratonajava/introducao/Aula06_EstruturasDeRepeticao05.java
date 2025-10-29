package com.bychaves.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorCarro = 50000;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.printf("Parcela " + parcela + " R$ %.2f%n ", valorParcela);


        }
    }
}
