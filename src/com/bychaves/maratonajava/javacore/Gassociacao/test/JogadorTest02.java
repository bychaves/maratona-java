package com.bychaves.maratonajava.javacore.Gassociacao.test;

import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.bychaves.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Everton Ribeiro");
        Time time = new Time("Bahia");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
