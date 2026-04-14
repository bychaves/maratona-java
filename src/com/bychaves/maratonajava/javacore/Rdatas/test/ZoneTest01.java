package com.bychaves.maratonajava.javacore.Rdatas.test;



import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId asiaZone = ZoneId.of("Asia/Shanghai");
        System.out.println(asiaZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(asiaZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(asiaZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(zonedDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);

    }
}
