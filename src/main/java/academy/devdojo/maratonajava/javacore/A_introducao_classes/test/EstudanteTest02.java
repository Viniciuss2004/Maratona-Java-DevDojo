package academy.devdojo.maratonajava.javacore.A_introducao_classes.test;

import academy.devdojo.maratonajava.javacore.A_introducao_classes.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Vinicius";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        estudante2.nome = "Lara";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("-------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
