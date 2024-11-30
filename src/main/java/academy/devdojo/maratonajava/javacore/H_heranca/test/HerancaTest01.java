package academy.devdojo.maratonajava.javacore.H_heranca.test;

import academy.devdojo.maratonajava.javacore.H_heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.H_heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.H_heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Estrada Bento Manoel Ferreira");
        endereco.setCep("88052-300");

        System.out.println("\n----- Pessoa -----\n");
        Pessoa pessoa = new Pessoa("Vinicius");
        pessoa.setCpf("428.543.784-12");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("\n----- Funcionário -----\n");
        Funcionario funcionario = new Funcionario("Lara");
        funcionario.setCpf("947.522.170-70");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);

        funcionario.imprime();
    }
}
