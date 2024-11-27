package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Vinicius");
        pessoa.setIdade(20);
        pessoa.imprime();
        System.out.println("----------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
