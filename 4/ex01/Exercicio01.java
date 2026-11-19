package ex01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] faturamento = new double[7];

        double total = 0;
        int melhor = 0;

        for (int i = 0; i < faturamento.length; i++) {
            System.out.print("Faturamento de " + dias[i] + ": R$ ");
            faturamento[i] = sc.nextDouble();
            total += faturamento[i];
            if (faturamento[i] > faturamento[melhor]) {
                melhor = i;
            }
        }

        double media = total / faturamento.length;

        System.out.printf("%nTotal da semana: R$ %.2f%n", total);
        System.out.printf("Média diária: R$ %.2f%n", media);
        System.out.printf("Dia que mais vendeu: %s (R$ %.2f)%n", dias[melhor], faturamento[melhor]);

        sc.close();
    }
}
