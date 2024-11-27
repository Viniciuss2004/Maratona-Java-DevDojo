package academy.devdojo.maratonajava.javacore.A_introducao_classes.test;

import academy.devdojo.maratonajava.javacore.A_introducao_classes.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Victor";
        professor.idade = 42;
        professor.sexo = 'M';

        System.out.print("Nome: " + professor.nome + " " + "Idade: " + professor.idade + " " + "Sexo: " + professor.sexo);
        System.out.print("\n\nNome: " + professor.nome + "\n" + "Idade: " + professor.idade + "\n" + "Sexo: " + professor.sexo);
    }
}
