package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturaCondicionais05 {
    public static void main(String[] args) {

        // Imprima o dia da semana, considerando 1 como domingo

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // Imprima o gênero, considerando as iniciais M e F

        char genero = 'M';
        switch (genero) {
            case 'M':
                System.out.println("Gênero masculino");
                break;
            case 'F':
                System.out.println("Gênero feminino");
                break;
            default:
                System.out.println("Não é um gênero");
                break;
        }
    }
}
