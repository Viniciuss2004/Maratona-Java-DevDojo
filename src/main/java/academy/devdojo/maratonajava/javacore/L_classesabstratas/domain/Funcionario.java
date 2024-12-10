package academy.devdojo.maratonajava.javacore.L_classesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public void imprime() {
        System.out.println("Inprimindo...");
    }

    @Override
    public String toString() {
        return nome + ", " + salario;
    }
}
