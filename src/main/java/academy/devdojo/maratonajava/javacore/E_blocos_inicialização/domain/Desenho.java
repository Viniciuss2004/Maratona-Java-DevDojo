package academy.devdojo.maratonajava.javacore.E_blocos_inicialização.domain;

public class Desenho {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo da classe é criado e inicializado com valores default ou o oque for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Desenho(String nome) {
        this.nome = nome;
    }

    public Desenho() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
