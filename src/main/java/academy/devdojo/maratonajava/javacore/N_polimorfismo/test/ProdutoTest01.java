package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 3500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
