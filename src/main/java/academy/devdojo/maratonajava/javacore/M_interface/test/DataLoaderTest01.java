package academy.devdojo.maratonajava.javacore.M_interface.test;

import academy.devdojo.maratonajava.javacore.M_interface.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.M_interface.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
