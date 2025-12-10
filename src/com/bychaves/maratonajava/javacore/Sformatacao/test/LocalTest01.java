package com.bychaves.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar calendar = Calendar.getInstance();
        DateFormat df0 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        System.out.println("Italia: " + df0.format(calendar.getTime()));
        System.out.println("Suiça: " + df1.format(calendar.getTime()));
        System.out.println("Idia: " + df2.format(calendar.getTime()));
        System.out.println("Japao: " + df3.format(calendar.getTime()));
        System.out.println("Holanda: " + df4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeHolanda));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
        System.out.println(localeItaly.getDisplayLanguage(localeHolanda));
    }
}
