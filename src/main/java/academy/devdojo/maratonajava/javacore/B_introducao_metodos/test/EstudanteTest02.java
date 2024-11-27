package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
