package academy.devdojo.maratonajava.javacore.L_classesabstratas.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + ", " + salario ;
    }
}
