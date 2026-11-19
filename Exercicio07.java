package ex07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[6];
        double[] totais = new double[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + ": ");
            nomes[i] = sc.next();
            System.out.print("Total vendido por " + nomes[i] + ": R$ ");
            totais[i] = sc.nextDouble();
        }

        // Ordenação por seleção (maior para o menor), trocando os dois vetores juntos
        for (int i = 0; i < totais.length - 1; i++) {
            int maior = i;
            for (int j = i + 1; j < totais.length; j++) {
                if (totais[j] > totais[maior]) {
                    maior = j;
                }
            }
            if (maior != i) {
                double tmpTotal = totais[i];
                totais[i] = totais[maior];
                totais[maior] = tmpTotal;

                String tmpNome = nomes[i];
                nomes[i] = nomes[maior];
                nomes[maior] = tmpNome;
            }
        }

        System.out.println("\nRanking de vendedores");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%dº  %-12s R$ %.2f%n", i + 1, nomes[i], totais[i]);
        }

        sc.close();
    }
}
