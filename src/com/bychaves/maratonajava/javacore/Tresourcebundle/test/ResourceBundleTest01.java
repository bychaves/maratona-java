package com.bychaves.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        String hello = bundle.getString("hello");
        String good = bundle.getString("good.morning");
        System.out.println(hello);
        System.out.println(good);
        // Lolcale(fr", "CA");
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_en_US.properties
        //messages_en.properties
        //messages.properties
        System.out.println(bundle.getString("hi"));

    }
}
