package academy.devdojo.maratonajava.javacore.A_introducao_classes.test;

import academy.devdojo.maratonajava.javacore.A_introducao_classes.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();

        estudante1.nome = "Vinicius";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

    }
}
