package academy.devdojo.maratonajava.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {

        //Operadores básicos: +, -, /, *

        int number1 = 10;
        int number2 = 20;

        System.out.println("Soma: " + (number1 + number2));
        System.out.println("Subtracao: " + (number1 - number2));
        System.out.println("Divisao: " + (number1 / number2));
        System.out.println("Multiplicacao: " + (number1 * number2));

        //Operador resto: %

        if (number1 % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }

        //Operadores comparação: >, <, <=, >=, ==, !=

        boolean greater = number1 > number2;
        boolean equals = number1 == number2;
        boolean smaller = number1 < number2;
        boolean different = number1 != number2;
        boolean greaterOrEquals = number1 >= number2;
        boolean smallerOrEquals = number1 <= number2;

        System.out.println("É maior? " + greater);
        System.out.println("É igual? " + equals);
        System.out.println("É menor? " + smaller);
        System.out.println("É diferente? " + different);
        System.out.println("É maior ou igual? " + greaterOrEquals);
        System.out.println("É menor ou igual? " + smallerOrEquals);

        //Operadores lógicos: && (AND), || (OR), ! (NOT)

        boolean man = true;
        boolean woman = true;
        boolean dog = false;

        if(man == true && woman == true) {
            System.out.println("Pode entrar no Banco");
        }
        if(man == true || woman == true) {
            System.out.println("Pode entrar no Banco");
        }
        if(man == true && woman == true && !dog == true){
            System.out.println("Pode entrar no Banco");
        }

        //Operadores de atribuição: =, +=, -=, *=, /=, %=

        double bonus= 500;

        double salario = 1500; // Salário: 1500
        salario += bonus; // Salário: 2000
        salario -= 200; // Salário: 1800
        salario /= 2; // Salário: 900
        salario *= 2; // Salário: 1800
        salario %= 2; // Salário: 0

        int contador = 0; // Contador: 0
        contador += 1; // Contador: 1
        contador ++; // Contador: 2
        contador --; // Contador: 1

        int contador2 = 0;

        // Ficará 1 apenas depois que passar a primeira linha
        System.out.println(contador2++);
        System.out.println(contador2);

        // Ficará 2 antes de passar a primeira linha
        System.out.println(++contador2);
        System.out.println(contador2);
    }
}
