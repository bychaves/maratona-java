package com.bychaves.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        // String é imutável. Nenhuma operação altera o conteúdo original.
        String nome = "Gabriel Chaves";

        // concat retorna uma nova String, mas como não é atribuída a uma variável,
        // o valor original de 'nome' permanece o mesmo.
        nome.concat(" Santos");

        // substring também retorna uma nova String sem alterar 'nome'.
        nome.substring(0, 3);

        // Imprime o valor original porque String é imutável.
        System.out.println(nome);

        // StringBuilder é mutável. Aqui, seu conteúdo pode ser alterado.
        StringBuilder sb = new StringBuilder("Gabriel Chaves");

        // append altera o objeto, adicionando ao final.
        sb.append(" Santos");

        // reverse inverte toda a String dentro do StringBuilder.
        sb.reverse();

        // reverse novamente volta para a ordem normal.
        sb.reverse();

        // delete remove os caracteres entre os índices [0, 3).
        // Isso remove as três primeiras letras.
        sb.delete(0, 3);

        // Imprime o conteúdo final do StringBuilder.
        System.out.println(sb);
    }
}
