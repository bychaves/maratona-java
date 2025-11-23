package com.bychaves.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // Interfaces em java, já são padronizados como public e abstract
    // Metodos abstratos precisa ter o " ; "

    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retiveMaxDataSize na interface");
    }
}
