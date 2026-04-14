package com.bychaves.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        // Obtém a data atual (sem hora)
        LocalDate date = LocalDate.now();

        // Formata a data no padrão BASIC_ISO_DATE -> yyyyMMdd (ex: 20260413)
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        // Formata a data no padrão ISO_DATE -> yyyy-MM-dd (com possível offset)
        String s2 = date.format(DateTimeFormatter.ISO_DATE);

        // Formata a data no padrão ISO_LOCAL_DATE -> yyyy-MM-dd (sem offset)
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        // Exibe os resultados
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----------------------------");

        // Faz o parse de String para LocalDate usando o padrão BASIC_ISO_DATE
        LocalDate parse1 = LocalDate.parse("20260413", DateTimeFormatter.BASIC_ISO_DATE);

        // Faz o parse com ISO_DATE (aceita timezone/offset)
        LocalDate parse2 = LocalDate.parse("2026-04-13+05:00", DateTimeFormatter.ISO_DATE);

        // Parse usando ISO_LOCAL_DATE (sem timezone)
        LocalDate parse3 = LocalDate.parse("2026-04-13", DateTimeFormatter.ISO_LOCAL_DATE);

        // Exibe os resultados convertidos
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        // Trabalhando com data + hora
        LocalDateTime now = LocalDateTime.now();

        // Formata data e hora no padrão ISO (ex: 2026-04-13T22:17:10.707)
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        // Converte String para LocalDateTime (parse automático ISO)
        LocalDateTime parses4 = LocalDateTime.parse("2026-04-13T22:17:10.7077212");
        System.out.println(parses4);

        // Exemplos de padrões personalizados:
        // dd/MM/yyyy → Brasil
        // MM/dd/yyyy → EUA
        // yyyy/MM/dd → padrão técnico

        System.out.println("----------------------");

        // Criando formatter no padrão brasileiro
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatando a data atual para o padrão BR
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        // Convertendo String no padrão BR para LocalDate
        LocalDate parseBR = LocalDate.parse("13/04/2026", formatterBR);
        System.out.println(parseBR);

        System.out.println("---------------------");

        // Formatter com Locale (idioma/região)
        // "MMMM" → nome do mês por extenso (ex: April, Abril, April em alemão)
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);

        // Formata usando idioma alemão
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);

        // Faz parse de data com mês em alemão
        LocalDate parseGR = LocalDate.parse("13.April.2026", formatterGR);
        System.out.println(parseGR);
    }
}