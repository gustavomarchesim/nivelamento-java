package com.gustavo.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class venda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo;
        double quantidade, valorFinal;
        double valor = 0;

        System.out.println("Informe o código do produto e quantidade do produto!! ");
        codigo = sc.nextInt();
        quantidade = sc.nextDouble();

        if (codigo == 1) {
            valor = 4.00;
        } else if (codigo == 2) {
            valor = 4.50;
        } else if (codigo == 3) {
            valor = 5.00;
        } else if (codigo == 4) {
            valor = 2.00;
        } else if (codigo == 5) {
            valor = 1.50;
        }
        valorFinal = valor * quantidade;

        System.out.printf("Total: R$%.2f%n", valorFinal);
        sc.close();
    }
}
