package com.gustavo.repeticao;

import java.util.Scanner;

public class for_linha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int quad = 0;
        int cubo = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            quad = i * i;
            System.out.print(quad + " ");
            cubo = i * i * i;
            System.out.println(cubo);
        }
        sc.close();
    }
}
