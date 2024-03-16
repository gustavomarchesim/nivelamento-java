package com.gustavo.condicionais;

import java.util.Scanner;

public class calcula_hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao;

        horaFinal = sc.nextInt();
        horaInicial = sc.nextInt();

        duracao = horaInicial < horaFinal ? horaFinal - horaInicial : 24 - horaInicial + horaFinal;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
