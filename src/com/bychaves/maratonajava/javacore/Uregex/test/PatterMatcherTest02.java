package com.bychaves.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos (espaço)
        // \w = a-ZA-Z, dígitos, -
        // \W = Tudo que não for incluso no \w

        String regex = "\\D";
//        String texto = "abaaba";
        String texto2 = "i912j39812n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
