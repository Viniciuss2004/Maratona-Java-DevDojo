package academy.devdojo.maratonajava.javacore.A_introducao_classes.test;

import academy.devdojo.maratonajava.javacore.A_introducao_classes.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Astra";
        carro1.marca = "Chevrolet";
        carro1.ano = 2004;

        carro1 = carro2;

        carro2.nome = "Gol g4";
        carro2.marca = "Volkswagen";
        carro2.ano = 2008;

        System.out.println("Carro 1\n");
        System.out.println("Nome: " + carro1.nome + "\nMarca: " + carro1.marca + "\nAno: " + carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println("\nNome: " + carro2.nome + "\nMarca: " + carro2.marca + "\nAno: " + carro2.ano);

    }
}
