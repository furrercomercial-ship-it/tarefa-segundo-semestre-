package ex08;

import java.util.Scanner;

public class Exercicio08 {

    static double[] lerFilial(Scanner sc, String nome, int qtd) {
        double[] v = new double[qtd];
        System.out.println("Vendas da " + nome + " (em ordem crescente):");
        for (int i = 0; i < qtd; i++) {
            System.out.print("  Venda " + (i + 1) + ": ");
            v[i] = sc.nextDouble();
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de vendas da filial A: ");
        int na = sc.nextInt();
        double[] a = lerFilial(sc, "filial A", na);

        System.out.print("Quantidade de vendas da filial B: ");
        int nb = sc.nextInt();
        double[] b = lerFilial(sc, "filial B", nb);

        double[] unido = new double[na + nb];
        int i = 0, j = 0, k = 0;

        // percorre os dois vetores ao mesmo tempo, sempre copiando o menor valor
        while (i < na && j < nb) {
            if (a[i] <= b[j]) {
                unido[k++] = a[i++];
            } else {
                unido[k++] = b[j++];
            }
        }
        // sobras de quem ainda tem elementos
        while (i < na) {
            unido[k++] = a[i++];
        }
        while (j < nb) {
            unido[k++] = b[j++];
        }

        System.out.println("\nVendas unificadas (ordenadas):");
        for (int x = 0; x < unido.length; x++) {
            System.out.printf("R$ %.2f%n", unido[x]);
        }

        sc.close();
    }
}
