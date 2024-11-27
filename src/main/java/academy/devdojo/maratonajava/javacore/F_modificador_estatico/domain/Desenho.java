package academy.devdojo.maratonajava.javacore.F_modificador_estatico.domain;

public class Desenho {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo da classe é criado e inicializado com valores default ou o oque for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização Estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização Estático 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização Estático 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não Estático");
    }

    public Desenho(String nome) {
        this.nome = nome;
    }

    public Desenho() {
        for (int episodio : Desenho.episodios) {
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
