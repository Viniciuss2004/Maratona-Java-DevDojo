package academy.devdojo.maratonajava.javacore.N_polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.N_polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            //Tomate tomate = (Tomate) produto;
            //System.out.println(tomate.getDataValidade());

            //System.out.println(((Tomate) produto).getDataValidade());

            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
