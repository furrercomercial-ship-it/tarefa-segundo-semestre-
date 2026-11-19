package ex02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] estoque = new int[10];

        for (int i = 0; i < estoque.length; i++) {
            System.out.print("Estoque do produto " + (i + 1) + ": ");
            estoque[i] = sc.nextInt();
        }

        int criticos = 0;
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] < 5) {
                criticos++;
            }
        }

        System.out.println("\nProdutos com menos de 5 unidades: " + criticos);

        if (criticos > 0) {
            System.out.println("Posições (produto -> quantidade):");
            for (int i = 0; i < estoque.length; i++) {
                if (estoque[i] < 5) {
                    System.out.println("  Posição " + (i + 1) + " (índice " + i + ") -> " + estoque[i] + " un.");
                }
            }
        }

        sc.close();
    }
}
