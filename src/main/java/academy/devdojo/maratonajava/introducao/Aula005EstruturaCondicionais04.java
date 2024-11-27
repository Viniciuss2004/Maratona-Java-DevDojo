package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturaCondicionais04 {
    public static void main(String[] args) {

        double salaryAnual = 25000;
        double valueTaxes;

        if (salaryAnual <= 34712) {
            valueTaxes = salaryAnual * 0.97;
        } else if (salaryAnual >= 34713 && salaryAnual <= 68507) {
            valueTaxes = salaryAnual * 0.3735;
        } else {
            valueTaxes = salaryAnual * 0.4950;
        }
        System.out.println(valueTaxes);
    }
}
