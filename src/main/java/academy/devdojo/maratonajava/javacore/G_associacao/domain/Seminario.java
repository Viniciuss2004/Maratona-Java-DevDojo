package academy.devdojo.maratonajava.javacore.G_associacao.domain;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local endereco;

    public Seminario(String titulo, Local endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario(String titulo, Aluno[] aluno, Local endereco) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Local: " + endereco);
    }

    public String getTitulo() {
        return titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        int quantidadeAlunos = (aluno != null) ? aluno.length : 0;

        return  " " + titulo +
                ", Quantidade de alunos: " + quantidadeAlunos +
                ", Local: " + endereco;
    }

}
