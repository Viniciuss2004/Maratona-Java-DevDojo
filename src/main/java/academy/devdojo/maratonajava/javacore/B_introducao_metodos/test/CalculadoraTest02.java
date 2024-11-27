package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Multiplicação dos dois números: ");
        calculadora.multiplicaDoisNumeros(20,10);
    }
}
