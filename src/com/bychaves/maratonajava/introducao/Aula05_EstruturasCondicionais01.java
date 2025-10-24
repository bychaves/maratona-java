package com.bychaves.maratonajava.introducao;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >=18;
        // Operador de negação: ! -

        if(isAutorizadoComprarBebida){
            System.out.println("Autoridazo a comprar bebida alcoolica");
        } else{
            System.out.println("Não autoridazo a comprar bebida alcoolica");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Não autoridazo a comprar bebida alcoolica");
        }

        boolean c = true;
        if (c == false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");

    }
}
