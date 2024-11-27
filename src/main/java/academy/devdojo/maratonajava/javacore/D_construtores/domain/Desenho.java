package academy.devdojo.maratonajava.javacore.D_construtores.domain;

public class Desenho {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Desenho(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Desenho(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Desenho() {
        System.out.println("Dentro do construtor sem argumentos\n");
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Episodio: " + episodios);
        System.out.println("Genêro: " + genero);
        System.out.println("Estudio: " + estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
