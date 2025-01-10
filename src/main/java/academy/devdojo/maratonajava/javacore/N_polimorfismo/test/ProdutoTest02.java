package academy.devdojo.maratonajava.javacore.N_polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Tomate;

import java.awt.*;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + produto.calcularImposto());
        System.out.println("-----------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Valor: " + produto2.getValor());
        //Não funciona pois não existe na super classe produto
        //System.out.println("Validade: " + produto2.getDataValidade());
        System.out.println("Imposto: " + produto2.calcularImposto());
    }
}
