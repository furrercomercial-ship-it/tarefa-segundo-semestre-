package ex05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // contagem[n] = quantas vezes a nota n apareceu (notas de 0 a 10)
        int[] contagem = new int[11];

        for (int i = 1; i <= 10; i++) {
            int nota;
            do {
                System.out.print("Nota do cliente " + i + " (0 a 10): ");
                nota = sc.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida.");
                }
            } while (nota < 0 || nota > 10);
            contagem[nota]++;
        }

        System.out.println("\nNota  Votos");
        int maisVotada = 0;
        for (int nota = 0; nota < contagem.length; nota++) {
            System.out.println(nota + "     " + contagem[nota]);
            if (contagem[nota] > contagem[maisVotada]) {
                maisVotada = nota;
            }
        }

        System.out.println("\nNota mais votada: " + maisVotada + " (" + contagem[maisVotada] + " votos)");

        // aviso em caso de empate
        for (int nota = 0; nota < contagem.length; nota++) {
            if (nota != maisVotada && contagem[nota] == contagem[maisVotada]) {
                System.out.println("Empate também com a nota " + nota);
            }
        }

        sc.close();
    }
}
