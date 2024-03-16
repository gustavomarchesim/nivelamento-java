package com.gustavo.condicionais;

import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        double valor = 50.00;
        if (tempo > 100) {
            valor += (tempo - 100) * 2;
        }

        System.out.printf("Valor a pagar: R$%.2f%n", valor);
        sc.close();
    }

}
