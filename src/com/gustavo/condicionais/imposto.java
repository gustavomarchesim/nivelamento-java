package com.gustavo.condicionais;

import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto;

        if (salario > 0.0 && salario <= 2000.00) {
            System.out.println("ISENTO");
        } else if (salario > 2000.01 && salario <= 3000.00) {
            imposto = (salario - 2000.00) * 8 / 100;
            System.out.printf("R$%.2f", imposto);
        } else if (salario > 3000.01 && salario <= 4500.00) {
            imposto = 1000.00 * 8 / 100 + (salario - 3000.00) * 18 / 100;
            System.out.printf("R$%.2f", imposto);
        } else if (salario > 4500.01) {
            imposto = 1000.00 * 8 / 100 + 1500.00 * 18 / 100 + (salario - 4500.00) * 28 / 100;
            System.out.printf("R$%.2f", imposto);
        }
        sc.close();
    }
}
