package ex10;

import java.util.Scanner;

public class Exercicio10 {
    static int contarMovimentos(int discos) {
        if (discos <= 0) return 0;
        return 2 * contarMovimentos(discos - 1) + 1;
    }

    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n <= 0) return;
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }

        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] jogos = new int[3];

        for (int i = 0; i < jogos.length; i++) {
            do {
                System.out.print("Quantidade de discos do jogo " + (i + 1) + ": ");
                jogos[i] = sc.nextInt();
                if (jogos[i] < 1) {
                    System.out.println("Digite pelo menos 1 disco.");
                }
            } while (jogos[i] < 1);
        }

        for (int i = 0; i < jogos.length; i++) {
            System.out.println("\nJogo " + (i + 1) + " - " + jogos[i] + " disco(s):");
            hanoi(jogos[i], 'A', 'C', 'B');
            System.out.println("Total: " + contarMovimentos(jogos[i]) + " movimentos");
        }

        sc.close();
    }
}
