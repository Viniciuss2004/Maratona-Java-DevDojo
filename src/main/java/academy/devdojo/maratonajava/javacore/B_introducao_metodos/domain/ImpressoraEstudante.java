package academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain;

public class ImpressoraEstudante {

    // Método para imprimir os dados de um objeto Estudante
    public void imprime(Estudante estudante) {

        // Imprime os detalhes do estudante
        System.out.println("------------------------");
        System.out.println(estudante.nome);  // Exibe o nome
        System.out.println(estudante.idade); // Exibe a idade
        System.out.println(estudante.sexo);  // Exibe o sexo

        // Modifica o nome do estudante para "Vinicius"
        estudante.nome = "Vinicius";
    }
}
