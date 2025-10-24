package com.bychaves.maratonajava.introducao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos primitivos: int, double, float, chat, byte, short, long, boolean

        /* Casting: Forçar uma variavel a se tornar outra
            long numeroGrande = (long) 155.23;
                Vai imprimir só 155 porque o long não suporte número com decimal

             Tipo primitivo = Guarda um valor simples
             String NÃO é primitivo. É uma classe. Classes começam com letra maiuscula.
        */


        int idade = 10;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'G';
        String nome = "EH O CHAVINHOOOO VIDAAA ツ";

        System.out.println("A idade é " + idade + "anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Quem esta falando? " + nome);


    }
}
