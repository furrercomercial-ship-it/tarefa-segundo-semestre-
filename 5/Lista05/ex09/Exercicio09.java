package ex09;

import java.util.Scanner;

public class Exercicio09 {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int somar(int[] termos) {
        int soma = 0;
        for (int termo : termos) {
            soma += termo;
        }
        return soma;
    }

    static void exibir(int[] termos) {
        System.out.print("Termos: ");
        for (int termo : termos) {
            System.out.print(termo + " ");
        }
        System.out.println("\nSoma: " + somar(termos));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite N (de 1 a 30): ");
            n = sc.nextInt();
        } while (n < 1 || n > 30);

        int[] termos = new int[n];
        for (int i = 0; i < n; i++) {
            termos[i] = fibonacci(i);
        }

        exibir(termos);
        sc.close();
    }
}
