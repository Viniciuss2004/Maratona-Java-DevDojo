package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.G_associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
