package academy.devdojo.maratonajava.introducao;

public class Aula006EstruturaDeRepeticao03 {
    public static void main(String[] args) {

        // Imprima os primeiros 25 números de um determinado valor, por exemplo, 50

        for (int i = 1; i <= 50; i++) {
            if (i == 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
