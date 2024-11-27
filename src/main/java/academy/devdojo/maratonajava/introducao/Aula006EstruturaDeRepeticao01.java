package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // Estrutura de Repetição: while, do while, for

        int cont = 0;

        System.out.println("Contagem com while");
        while (cont < 10) {
            System.out.println(++cont);
        }

        System.out.println("Contagem com do while");
        do {
            System.out.println(cont--);
        } while (cont > 0);

        System.out.println("Contagem com for (+)");
        for (int i = 0 ; i < 10; i++) {
            System.out.println(++cont);
        }
    }
}
