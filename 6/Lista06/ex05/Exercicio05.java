package ex05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
