package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vini jr");
        Jogador jogador2 = new Jogador("Arrascaeta");
        Jogador jogador3 = new Jogador("CR7");

        Jogador[] jogadores = { jogador1, jogador2, jogador3 };

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
