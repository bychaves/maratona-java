package com.bychaves.maratonajava.javacore.Dconstrutores.test;


import com.bychaves.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Goku", "TV", 12, "Shonen", "Toei");
        anime.imprime();
    }
}
