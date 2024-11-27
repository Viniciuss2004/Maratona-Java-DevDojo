package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.G_associacao.domain.Local;
import academy.devdojo.maratonajava.javacore.G_associacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.G_associacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local1 = new Local("Florianópolis");
        Local local2 = new Local("São Paulo");

        Aluno aluno1 = new Aluno("Vinicius", 20);
        Aluno aluno2 = new Aluno("Lara", 20);
        Aluno[] alunos = {aluno1, aluno2};

        Professor professor1 = new Professor("Ricardo", "Desenvolvedor de Software");

        Seminario seminario1 = new Seminario("Tech Week", alunos, local1);
        Seminario seminario2 = new Seminario("AWS cloud", alunos, local2);
        Seminario[] seminarios = {seminario1, seminario2};

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);

        seminario1.setAluno(alunos);

        professor1.setSeminarios(seminarios);

        System.out.println("\n---- Aluno ----");
        for (Aluno aluno : alunos) {
            System.out.println("");
            aluno.imprime();
        }

        System.out.println("\n---- Professor ----\n");
        professor1.imprime();

        System.out.println("\n---- Seminario ----\n");
        for (Seminario seminario : seminarios) {
            System.out.println("Seminario: " + seminario);
        }

    }
}
