package com.bychaves.maratonajava.javacore.Gassociacao.test;

import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("CR7");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }


    }
}
