package academy.devdojo.maratonajava.javacore.D_construtores.test;

import academy.devdojo.maratonajava.javacore.D_construtores.domain.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {
        Desenho desenho = new Desenho("Jovens Titãs","TV", 16, "Ação");
        Desenho desenho2 = new Desenho("Simpsons","TV", 27, "Comédia","Fox");

        System.out.println("------------------------\nObjeto 1\n");
        desenho.imprime();
        System.out.println("------------------------\nObjeto 2\n");
        desenho2.imprime();
    }
}
