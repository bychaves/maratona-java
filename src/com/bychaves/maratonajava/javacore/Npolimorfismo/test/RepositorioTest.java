package com.bychaves.maratonajava.javacore.Npolimorfismo.test;

import com.bychaves.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.bychaves.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Gohan");
        list.add("Vegeta");
        System.out.println(list);
    }
}
