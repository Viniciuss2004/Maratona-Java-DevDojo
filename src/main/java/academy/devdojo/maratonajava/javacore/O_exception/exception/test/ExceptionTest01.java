package academy.devdojo.maratonajava.javacore.O_exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File arquivo = new File("arquivo\\test.txt");
        try {
            boolean criado = arquivo.createNewFile();
            System.out.println("Arquivo criado " + criado + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
