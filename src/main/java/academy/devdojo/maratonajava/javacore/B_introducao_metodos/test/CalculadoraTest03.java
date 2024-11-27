package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Divisão dos dois números ");

        System.out.println("\nMétodo divideDoisNumeros");
        System.out.println(calculadora.divideDoisNumeros(10,5));

        System.out.println("\nMétodo divideDoisNumeros02");
        System.out.println(calculadora.divideDoisNumeros02(20,5));

        System.out.println("\nMétodo imprimeDivisaoDeDoisNumeros");
        calculadora.imprimeDivisaoDeDoisNumeros(30,0);
    }
}
