package com.gustavo.repeticao;

import java.util.Scanner;

public class for_casos_teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double media = 0;
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            media = ((2.0 * a) + (3.0 * b) + (5.0 * c)) / (2.0 + 3.0 + 5.0);

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
