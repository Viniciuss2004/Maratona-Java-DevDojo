package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula007Arrays01 {
    public static void main(String[] args) {

        int[] age = new int[3];

        age[0] = 13;
        age[1] = 47;
        age[2] = 31;

        //age[3] = 10; Dará erro pois passou do limite de Arrays

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
    }
}
