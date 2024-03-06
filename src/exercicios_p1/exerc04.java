package exercicios_p1;

import java.util.Locale;
import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, qntHoras;
        double salary, valorHora;

        number = sc.nextInt();
        qntHoras = sc.nextInt();
        valorHora = sc.nextDouble();
        salary = qntHoras * valorHora;

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY =  U$%.2f%n", salary);
        sc.close();
    }
}
