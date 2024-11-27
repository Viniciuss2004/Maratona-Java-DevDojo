package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturaCondicionais01 {
    public static void main(String[] args) {

        int age = 20;
        boolean isAutorized = age >= 18;

        if (isAutorized) {
            System.out.println("Pode comprar bebidas alcólicas");
        } else {
            System.out.println("Não pode comprar bebidas alcólicas");
        }

        if (!isAutorized) {
            System.out.println("Não pode comprar bebidas alcólicas");
        }
    }
}
