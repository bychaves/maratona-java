package com.bychaves.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        // Imprime a data e hora atuais usando a API antiga (java.util.Date)
        System.out.println(new Date());

        // Imprime o estado completo de um Calendar configurado com a data/hora atuais
        System.out.println(Calendar.getInstance());

        // Imprime o número correspondente ao mês de DEZEMBRO (12)
        System.out.println(Month.DECEMBER.getValue());

        // Cria uma data específica: 10 de dezembro de 2025
        LocalDate date = LocalDate.of(2025, Month.DECEMBER, 10);

        // Obtém a data atual do sistema
        LocalDate agora = LocalDate.now();

        // Acrescenta 1 semana (7 dias) à data atual
        agora = agora.plusWeeks(1);

        // Obtém o ano da data especificada (2025)
        System.out.println(date.getYear());

        // Obtém o mês em formato Enum (DECEMBER)
        System.out.println(date.getMonth());

        // Obtém o número do mês (12)
        System.out.println(date.getMonthValue());

        // Obtém o dia da semana (ex: WEDNESDAY)
        System.out.println(date.getDayOfWeek());

        // Obtém o número do dia dentro do mês (10)
        System.out.println(date.getDayOfMonth());

        // Retorna quantos dias existem no mês de dezembro (31)
        System.out.println(date.lengthOfMonth());

        // Verifica se o ano de 2025 é bissexto (false)
        System.out.println(date.isLeapYear());

        // Obtém o ano usando ChronoField (equivalente a getYear)
        System.out.println(date.get(ChronoField.YEAR));

        // Obtém o dia do mês usando ChronoField (equivalente a getDayOfMonth)
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        // Imprime a data armazenada em 'date' (formato ISO: YYYY-MM-DD)
        System.out.println(date);

        // Imprime a data atual (já com +1 semana)
        System.out.println(agora);

        // Maior data possível representada pelo LocalDate (+999999999-12-31)
        System.out.println(LocalDate.MAX);

        // Menor data possível representada pelo LocalDate (-999999999-01-01)
        System.out.println(LocalDate.MIN);
    }
}
