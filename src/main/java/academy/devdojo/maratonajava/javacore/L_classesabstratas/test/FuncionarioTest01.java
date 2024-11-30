package academy.devdojo.maratonajava.javacore.L_classesabstratas.test;

import academy.devdojo.maratonajava.javacore.L_classesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.L_classesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lara", 4000);
        Desenvolvedor denvolvedor = new Desenvolvedor("Vinicius", 6000);
        System.out.println(gerente);
        System.out.println(denvolvedor);

    }
}
