package com.bychaves.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 10, 15); // Retorna o horário prescrito
        LocalTime timeNow = LocalTime.now(); // Retorna o horario atual da máquina

        System.out.println(time);                           // Imprime o horário armazenado em 'time' (ex: 23:10:15)
        System.out.println(timeNow);                        // Imprime o horário atual da máquina
        System.out.println(time.getHour());                 // Retorna apenas a hora (0–23)
        System.out.println(time.getMinute());               // Retorna apenas os minutos (0–59)
        System.out.println(timeNow.getSecond());            // Retorna os segundos atuais do horário do máquina

        System.out.println("-------------------");

        System.out.println(timeNow.getHour());              // Hora atual da máquina
        System.out.println(timeNow.getMinute());            // Minutos atuais a máquina
        System.out.println(time.getSecond());               // Segundos do objeto 'time'

        System.out.println("-------------------");

        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM)); // Retorna a hora no formato 12h (1–12)
        System.out.println(LocalTime.MIN);                  // Menor horário possível (00:00)
        System.out.println(LocalTime.MAX);                  // Maior horário possível (23:59:59.999999999)
    }
}
