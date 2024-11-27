package academy.devdojo.maratonajava.javacore.G_associacao.test;

import academy.devdojo.maratonajava.javacore.G_associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.G_associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bruno Henrique");
        Time time = new Time("Flamengo");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
