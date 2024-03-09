package com.gustavo.condicionais;

import java.util.Scanner;

public class ler_inteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Qual número?");
        a = sc.nextInt();

        if (a < 0) {
            System.out.println("NEGATIVO!");
        } else {
            System.out.println("NAO NEGATIVO!");
        }
        sc.close();
    }

}
