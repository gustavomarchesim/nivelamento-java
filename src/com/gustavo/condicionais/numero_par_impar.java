package com.gustavo.condicionais;

import java.util.Scanner;

public class numero_par_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Qual número?");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR!");
        }
        sc.close();
    }
}
