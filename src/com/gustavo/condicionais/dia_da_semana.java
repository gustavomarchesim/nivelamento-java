package com.gustavo.condicionais;

import java.util.Scanner;

public class dia_da_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "segunda";
                break;
            case 2:
                dia = "terça";
                break;
            case 3:
                dia = "quarta";
                break;
            case 4:
                dia = "quinta";
                break;
            case 5:
                dia = "sexta";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "valor inválido";
                break;
        }
        System.out.println("Dia da semana = " + dia);
        sc.close();
    }
}
