package ex04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int quantidadePares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + quantidadePares);
        sc.close();
    }
}
