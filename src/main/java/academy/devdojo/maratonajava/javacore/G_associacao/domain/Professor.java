package academy.devdojo.maratonajava.javacore.G_associacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (seminarios == null) return;
        for(Seminario seminario : seminarios) {
            System.out.println("Seminario:" + seminario);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
