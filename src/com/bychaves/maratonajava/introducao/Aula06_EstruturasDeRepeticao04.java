package com.bychaves.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        int valorCarro = 50000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }


}

