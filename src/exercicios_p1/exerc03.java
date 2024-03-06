package exercicios_p1;

import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diff;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diff = (a * b - c * d);

        System.out.printf("Diferença = %d", diff);
        sc.close();
    }
}
