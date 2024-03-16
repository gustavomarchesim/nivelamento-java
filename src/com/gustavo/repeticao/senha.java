package com.gustavo.repeticao;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        int resposta = 2002;
        while (senha != resposta) {
            System.out.println("SENHA INVÁLIDA");
            senha = sc.nextInt();
        }
        System.out.println("ACESSO PERMITIDO!");
        sc.close();
    }

}
