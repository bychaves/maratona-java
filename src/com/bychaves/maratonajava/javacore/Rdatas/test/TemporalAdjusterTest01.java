package com.bychaves.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


class ObterProximoDiaUtyil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        // ENTRADA:
        // temporal = uma data (ex: 2025-12-13)

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        // PROCESSO:
        // Extrai o dia da semana da data
        // Ex: MONDAY, FRIDAY, SATURDAY...

        int addDays;
        // Variável que define quantos dias serão adicionados

        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            // Quinta → pula para segunda (quinta + 4 dias)

            case FRIDAY:
                addDays = 3;
                break;
            // Sexta → pula para segunda (sexta + 3 dias)

            case SATURDAY:
                addDays = 2;
                break;
            // Sábado → pula para segunda (sábado + 2 dias)

            default:
                addDays = 1;
                // Segunda, terça, quarta → próximo dia (+1)
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
        // SAÍDA:
        // Retorna a data ajustada para o próximo dia útil
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // ENTRADA:
        // Data atual do sistema

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        // SAÍDA:
        // Mostra a data atual e o dia da semana

        now = LocalDate.now().with(new ObterProximoDiaUtyil());
        // PROCESSO:
        // Aplica o ajuste personalizado
        // Move a data para o próximo dia útil

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        // SAÍDA:
        // Mostra a nova data ajustada e o novo dia da semana

        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtyil());
        // ENTRADA:
        // Define o dia do mês como 15
        // PROCESSO:
        // Aplica o ajuste para o próximo dia útil a partir dessa data

        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        // SAÍDA:
        // Mostra a data final ajustada e o dia da semana
    }
}