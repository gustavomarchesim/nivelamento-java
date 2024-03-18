package com.gustavo.strings;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        int maior = 0;
        System.out.println("Insira três números! ");
        for (int i = 0; i < 3; i++) {
            maior = Max(maior);
        }
        showResult(maior);
    }

    public static int Max(int maior) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > maior) {
            maior = n;
        }
        return maior;
    }

    public static void showResult(int value) {
        System.out.println("Maior número: " + value);
    }
}
