package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.G_associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Victor", "Educação Fisica");
        Professor professor2 = new Professor("Roberta", "Ginastica");
        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("Jovem", professores);

        escola.imprime();
    }
}
