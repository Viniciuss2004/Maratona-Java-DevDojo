package academy.devdojo.maratonajava.javacore.G_associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Software que prever o futuro\n");
        System.out.println("Digite sua pergunta e eu responderei Sim ou Não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}