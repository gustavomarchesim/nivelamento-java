package com.gustavo.repeticao;

import java.util.Scanner;

public class for_divisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double divisao = 0.0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = a / b;
                System.out.printf("%.1f%n", divisao);
            }

        }
        sc.close();
    }

}
