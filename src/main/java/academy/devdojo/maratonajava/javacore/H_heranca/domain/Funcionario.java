package academy.devdojo.maratonajava.javacore.H_heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco inicialização estatico de Funcionário");
    }

    {
        System.out.println("Dentro do bloco inicialização de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco inicialização de Funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
