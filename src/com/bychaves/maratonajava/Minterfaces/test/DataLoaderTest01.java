package com.bychaves.maratonajava.Minterfaces.test;

import com.bychaves.maratonajava.Minterfaces.dominio.DataLoader;
import com.bychaves.maratonajava.Minterfaces.dominio.DatabaseLoader;
import com.bychaves.maratonajava.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        DatabaseLoader.retriveMaxDataSize();
        DataLoader.retriveMaxDataSize();
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
    }
}
