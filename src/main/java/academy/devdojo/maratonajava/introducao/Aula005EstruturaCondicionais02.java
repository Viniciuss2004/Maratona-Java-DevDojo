package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturaCondicionais02 {
    public static void main(String[] args) {

        int age = 20;
        String categoria;

        if (age <= 15) {
            categoria = "Categoria: infantil";
        } else if (age > 15 && age < 18) {
            categoria = "Categoria: juvenil";
        } else {
            categoria = "Categoria: adulta";
        }
        System.out.println(categoria);
    }
}
