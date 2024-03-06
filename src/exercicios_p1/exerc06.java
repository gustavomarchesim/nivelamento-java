package exercicios_p1;

import java.util.Locale;
import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaT, areaC, areaTa, areaQ, areaR;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaT = (A * C) / 2;
        areaC = Math.PI * Math.pow(C, 2);
        areaTa = ((A + B) * C) / 2;
        areaQ = Math.pow(B, 2);
        areaR = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaT);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaTa);
        System.out.printf("QUADRADO: %.3f%n", areaQ);
        System.out.printf("RETANGULO: %.3f%n", areaR);
        sc.close();
    }
}
