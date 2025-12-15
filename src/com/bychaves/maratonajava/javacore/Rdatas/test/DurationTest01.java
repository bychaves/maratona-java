package com.bychaves.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {

        // Obtém a data e hora atuais do sistema
        LocalDateTime now = LocalDateTime.now();

        // Obtém a data e hora atual e adiciona 2 anos e 8 minutos
        LocalDateTime nowAfterTwoYears = LocalDateTime.now()
                .plusYears(2)
                .plusMinutes(8);

        // Obtém o horário atual do sistema
        LocalTime timeNow = LocalTime.now();

        // Obtém o horário atual subtraindo 7 horas
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        // Cria uma Duration representando o intervalo entre duas datas/horas (LocalDateTime)
        Duration d1 = Duration.between(now, nowAfterTwoYears);

        // Cria uma Duration representando a diferença entre dois horários (LocalTime)
        // Obs: Pode resultar em valor negativo se o segundo horário for "antes" do primeiro
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);

        // Cria uma Duration entre o instante atual e outro instante 1000 segundos à frente
        Duration d3 = Duration.between(
                Instant.now(),
                Instant.now().plusSeconds(1000)
        );

        // Cria uma Duration fixa de 20 dias
        Duration d4 = Duration.ofDays(20);

        // Cria uma Duration fixa de 3 segundos
        Duration d5 = Duration.ofSeconds(3);

        // Cria uma Duration fixa de 3 horas usando ChronoUnit
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
