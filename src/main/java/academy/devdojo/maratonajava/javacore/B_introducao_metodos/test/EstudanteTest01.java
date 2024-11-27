package academy.devdojo.maratonajava.javacore.B_introducao_metodos.test;

// Importa as classes Estudante e ImpressoraEstudante
import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        // Criação de dois objetos Estudante
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        // Criação de um objeto ImpressoraEstudante
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        // Atribuição de valores ao primeiro estudante
        estudante01.nome = "João";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        // Atribuição de valores ao segundo estudante
        estudante02.nome = "Maria";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        // Impressão dos dados dos estudantes usando a classe ImpressoraEstudante
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        // Separação visual no console
        System.out.println("##########################");

        // Reimpressão dos dados dos estudantes após possível alteração
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
