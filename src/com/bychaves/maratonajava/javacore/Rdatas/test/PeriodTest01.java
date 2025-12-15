package com.bychaves.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // ENTRADA (data atual):
        // now = 2025-12-15
        // Pega a data atual do sistema

        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);
        // ENTRADA:
        // now = 2025-12-15
        // SAÍDA:
        // nowAfterTwoYears = 2027-12-15
        // Soma 2 anos à data atual

        Period p1 = Period.between(now, nowAfterTwoYears);
        // ENTRADA:
        // início = 2025-12-15
        // fim    = 2027-12-15
        // SAÍDA:
        // P2Y  (2 anos)
        // Calcula o período entre duas datas

        Period p2 = Period.ofDays(10);
        // ENTRADA:
        // valor = 10 dias
        // SAÍDA:
        // P10D
        // Cria um período fixo de 10 dias

        Period p3 = Period.ofWeeks(58);
        // ENTRADA:
        // 58 semanas
        // PROCESSO:
        // 58 x 7 = 406 dias
        // SAÍDA:
        // P406D
        // Semanas são convertidas apenas em dias

        Period p4 = Period.ofMonths(3);
        // ENTRADA:
        // 3 meses
        // SAÍDA:
        // P3M

        Period p5 = Period.ofYears(3);
        // ENTRADA:
        // 3 anos
        // SAÍDA:
        // P3Y
        // Cria um período fixo de 3 anos

        System.out.println(p1);
        // ENTRADA:
        // p1 = período entre 2025-12-15 e 2027-12-15
        // SAÍDA NO CONSOLE:
        // P2Y
        // Mostra que o período é de 2 anos

        System.out.println(p2);
        // ENTRADA:
        // p2 = 10 dias
        // SAÍDA NO CONSOLE:
        // P10D
        // Mostra um período de 10 dias

        System.out.println(p3);
        // ENTRADA:
        // p3 = 58 semanas → 406 dias
        // SAÍDA NO CONSOLE:
        // P406D
        // Mostra o período em dias

        System.out.println(p4);
        // ENTRADA:
        // p4 = 3 meses
        // SAÍDA NO CONSOLE:
        // P3M
        // Mostra o período de 3 meses

        System.out.println(p5);
        // ENTRADA:
        // p5 = 3 anos
        // SAÍDA NO CONSOLE:
        // P3Y
        // Mostra o período de 3 anos

        System.out.println(p3.getMonths());
        // ENTRADA:
        // p3 = P406D
        // SAÍDA NO CONSOLE:
        // 0
        // Não existem meses dentro de p3, apenas dias

        System.out.println(
                Period.between(
                        LocalDate.now(),
                        LocalDate.now().plusDays(p3.getDays())
                ).getMonths()
        );
        // ENTRADA:
        // data inicial = 2025-12-15
        // dias somados = 406
        // data final = 2027-01-25 (aproximadamente)
        // PROCESSO:
        // Java calcula a diferença entre as duas datas
        // SAÍDA NO CONSOLE (exemplo):
        // 1
        // Indica que existe 1 mês completo nesse intervalo
    }
}
