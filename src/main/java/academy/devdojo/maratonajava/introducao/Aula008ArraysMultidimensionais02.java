package academy.devdojo.maratonajava.introducao;

public class Aula008ArraysMultidimensionais02 {
    public static void main(String[] args) {

        // Declaração de um array bidimensional onde apenas o número de linhas é especificado.
        int[][] arrayInt = new int[3][];

        // Inicialização das linhas do array com arrays de tamanhos diferentes (array irregular).
        arrayInt[0] = new int[]{1, 2};        // Primeira linha com 2 elementos.
        arrayInt[1] = new int[]{3, 4, 5};    // Segunda linha com 3 elementos.
        arrayInt[2] = new int[]{6, 7, 8, 9}; // Terceira linha com 4 elementos.

        // Declaração e inicialização direta de um array bidimensional com os mesmos valores do array acima.
        int[][] arrayInt2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        // Itera sobre cada linha do array arrayInt.
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n----------------"); // Imprime uma linha divisória para separar as linhas.
            // Itera sobre cada elemento da linha atual.
            for (int num : arrayBase) {
                System.out.print(num + " "); // Imprime os elementos da linha atual, separados por espaço.
            }
        }

        // Itera sobre cada linha do array arrayInt2.
        for (int[] arrayBase2 : arrayInt2) {
            System.out.println("\n----------------"); // Imprime uma linha divisória para separar as linhas.
            // Itera sobre cada elemento da linha atual.
            for (int num2 : arrayBase2) {
                System.out.print(num2 + " "); // Imprime os elementos da linha atual, separados por espaço.
            }
        }

    }
}
