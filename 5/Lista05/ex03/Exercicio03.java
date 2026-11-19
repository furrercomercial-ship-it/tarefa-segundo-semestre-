package ex03;

import java.util.Scanner;

public class Exercicio03 {
    static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    static void exibirPrimos(int[] numeros) {
        System.out.print("Primos: ");
        boolean encontrou = false;
        for (int numero : numeros) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
                encontrou = true;
            }
        }
        if (!encontrou) System.out.print("Nenhum número primo");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);
        sc.close();
    }
}
