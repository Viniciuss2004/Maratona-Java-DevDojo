package academy.devdojo.maratonajava.introducao;

public class Aula002_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, long, boolean
        int myAge = 20;
        double currentSalary = 1000.00;
        float height = 1.75f;           // Declaração de float exige o sufixo 'f'
        char gender = 'M';              // Tipo char usa aspas simples
        char ascii = 65;              // Tipo char com tabel ASCII
        char uniCode = '\u0041';              // Tipo char com tabel UniCode
        byte dayOfMonth = 15;           // Tipo byte, armazenando pequenos números inteiros
        long distance = 100000000L;     // Declaração de long exige o sufixo 'L'
        boolean isEmployed = true;      // Tipo boolean pode ser true ou false

        String text = "ABCDEFGHJKLMNOPQRSTUVWXYZ"; // Tipo String serve para armazenar palavras

        System.out.println("Idade: " + myAge);
        System.out.println("Salário atual: " + currentSalary);
        System.out.println("Altura: " + height);
        System.out.println("Gênero: " + gender);
        System.out.println("Letra ASCII: " + ascii);
        System.out.println("Letra UniCode: " + uniCode);
        System.out.println("Dia do mês: " + dayOfMonth);
        System.out.println("Distância: " + distance);
        System.out.println("Está empregado: " + isEmployed);
        System.out.println("Alfabeto: " + text);


    }
}

