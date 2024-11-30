package academy.devdojo.maratonajava.javacore.H_heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco inicialização estatico de Pessoa");
    }

    {
        System.out.println("Dentro do bloco inicialização de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereco: " + endereco.getCep() + ", " + endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
