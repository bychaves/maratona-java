package com.bychaves.maratonajava.javacore.Csobrecargametodos.test;


import com.bychaves.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Goku", "TV", 12, "Shonen");
        anime.imprime();

    }


}
