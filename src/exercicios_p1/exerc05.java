package exercicios_p1;

import java.util.Locale;
import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qnt1, qnt2;
        double valorP1, valorP2, total;

        qnt1 = sc.nextInt();
        valorP1 = sc.nextDouble();

        qnt2 = sc.nextInt();
        valorP2 = sc.nextDouble();

        total = qnt1 * valorP1 + qnt2 * valorP2;

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
        sc.close();
    }
}
