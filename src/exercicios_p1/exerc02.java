
package exercicios_p1;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class exerc02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double area, raio;

        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Área total = %.4f%n", area);
        sc.close();
    }
}
