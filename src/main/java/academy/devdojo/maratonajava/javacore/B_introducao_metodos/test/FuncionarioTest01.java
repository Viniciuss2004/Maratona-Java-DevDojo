package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        double[] salarios = {1000,2000,3000};

        funcionario.setNome("Vinicius");
        funcionario.setIdade(20);
        funcionario.setSalarios(salarios);

        funcionario.imprimirDados();
        System.out.println("-------------------------");
        funcionario.mediaSalarial(salarios);

        System.out.println("Média salarial: " + funcionario.getMediaSalarial());
    }
}
