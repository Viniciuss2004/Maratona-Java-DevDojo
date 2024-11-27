package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma dos dois números: ");
        calculadora.somaDoisNumeros();

        System.out.println("Subtração dos dois números: ");
        calculadora.subtraiDoisNumeros();
    }
}
