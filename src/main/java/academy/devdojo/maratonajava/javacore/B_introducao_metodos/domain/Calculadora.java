package academy.devdojo.maratonajava.javacore.B_introducao_metodos.domain;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(15 - 10);
    }

    public void multiplicaDoisNumeros(int x, int y) {
        System.out.println(x * y);
    }

    public double divideDoisNumeros(double x, double y) {

        if (y == 0) {
            return 0;
        }
        return x / y;
    }

    public double divideDoisNumeros02(double x, double y) {

        if (y != 0) {
            return x / y;
        }
            return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double x, double y) {

        if (y == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
            System.out.println(x / y);
    }

    public void alteraDoisNumeros(int x, int y) {

        x = 10;
        y = 20;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("X " + x);
        System.out.println("Y " + y);
    }

    public void somaArray(int[] numeros) {

        int soma = 0;
        for (int calculo : numeros) {
            soma += calculo;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {

        int soma = 0;
        for (int calculo : numeros) {
            soma += calculo;
        }
        System.out.println(soma);
    }
}
