package academy.devdojo.maratonajava.javacore.J_modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.J_modificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.J_modificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Vinicius");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari");
        ferrari.imprime();
    }
}
