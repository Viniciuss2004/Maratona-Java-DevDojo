package academy.devdojo.maratonajava.javacore.C_sobrecarga_metodos.test;

import academy.devdojo.maratonajava.javacore.C_sobrecarga_metodos.domain.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();

        desenho.init("Simpsons", "TV", 16);
        desenho.init("Simpsons", "TV", 16,"Humor");
        desenho.imprime();


    }
}
