package com.gustavo.condicionais;

import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Quais números? ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0) {
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS!");
        }
        sc.close();
    }

}
