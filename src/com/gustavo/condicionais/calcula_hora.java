package com.gustavo.condicionais;

import java.util.Scanner;

public class calcula_hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        horaFinal = sc.nextInt();
        horaInicial = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
