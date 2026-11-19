package ex01;

import java.util.Scanner;

public class Exercicio01 {
    static int contarDigitos(int numero) {
        if (numero == 0) return 1;
        int quantidade = 0;
        while (numero > 0) {
            quantidade++;
            numero /= 10;
        }
        return quantidade;
    }

    static void exibirDigitos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " dígito(s)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número positivo: ");
            numeros[i] = sc.nextInt();
        }

        exibirDigitos(numeros);
        sc.close();
    }
}
