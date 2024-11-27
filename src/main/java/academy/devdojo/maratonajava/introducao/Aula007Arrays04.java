package academy.devdojo.maratonajava.introducao;

public class Aula007Arrays04 {
    public static void main(String[] args) {

        // Inicializa de forma que terei que colocar valores no array
        int[] numeros = new int[5];

        // Inicializa de forma que já tem valores no array
        int[] numeros2 = {1,2,3,4,5};

        // Inicializa de forma que já tem valores no array porém mais complexa
        int[] numeros3= new int [] {1,2,3,4,5};


        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        // Foreach para ler arrays
        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}
