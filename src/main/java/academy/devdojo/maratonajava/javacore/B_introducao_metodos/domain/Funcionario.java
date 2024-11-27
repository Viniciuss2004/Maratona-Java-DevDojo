package academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double mediaSalarial = 0;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) {
            return;
        }
        int num = 1;
        for (double salario : salarios) {
            System.out.println("Salário " + num + ": " + salario);
            num++;
        }
    }

    public void mediaSalarial(double[] salario) {

        if (salarios == null) {
            return;
        }
        for (double calculoSalario : salario) {
            mediaSalarial += calculoSalario;
        }
        mediaSalarial /= salario.length;
        System.out.println("Média Salarial: " + mediaSalarial);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaSalarial() {
        return mediaSalarial;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
