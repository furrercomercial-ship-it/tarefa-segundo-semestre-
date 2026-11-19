package ex02;

import java.util.Scanner;

public class Exercicio02 {
    static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }

    static void exibirInvertidos(int[] numeros) {
        for (int numero : numeros) {
            System.out.println(numero + " ao contrário: " + inverterNumero(numero));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número positivo: ");
            numeros[i] = sc.nextInt();
        }

        exibirInvertidos(numeros);
        sc.close();
    }
}
