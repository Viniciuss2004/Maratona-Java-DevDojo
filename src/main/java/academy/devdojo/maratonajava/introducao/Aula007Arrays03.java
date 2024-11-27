package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays03 {
    public static void main(String[] args) {

        // byte, short, int, long, float e double = 0
        // char '\u0000' = ''
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "Vinicius";
        nomes[1] = "Lara";
        nomes[2] = "Fernando";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
