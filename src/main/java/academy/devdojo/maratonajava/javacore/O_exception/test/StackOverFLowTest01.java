package academy.devdojo.maratonajava.javacore.O_exception.test;

public class StackOverFLowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}