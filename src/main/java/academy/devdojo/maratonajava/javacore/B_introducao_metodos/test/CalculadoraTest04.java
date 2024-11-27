package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int x = 1;
        int y = 2;

        calculadora.alteraDoisNumeros(x,y);
        System.out.println("\nDentro da CalculadoraTest04");
        System.out.println("X " + x);
        System.out.println("Y " + y);
    }
}
