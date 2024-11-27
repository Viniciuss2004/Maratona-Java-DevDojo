package academy.devdojo.maratonajava.javacore.E_blocos_inicialização.test;

import academy.devdojo.maratonajava.javacore.E_blocos_inicialização.domain.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {

        Desenho desenho = new Desenho();

        for (int episodio : desenho.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
