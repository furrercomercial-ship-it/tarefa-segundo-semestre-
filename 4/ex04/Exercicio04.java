package ex04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double REAJUSTE = 0.10;
        final double TETO = 5000.00;

        double[] antes = new double[8];
        double[] depois = new double[8];

        for (int i = 0; i < antes.length; i++) {
            System.out.print("Salário do funcionário " + (i + 1) + ": R$ ");
            antes[i] = sc.nextDouble();
        }

        double aumentoTotal = 0;
        for (int i = 0; i < antes.length; i++) {
            double reajustado = antes[i] * (1 + REAJUSTE);

            if (reajustado > TETO) {
                // o teto só limita o novo salário; quem já ganha acima dele não é reduzido
                reajustado = Math.max(TETO, antes[i]);
            }

            depois[i] = reajustado;
            aumentoTotal += depois[i] - antes[i];
        }

        System.out.println("\nFunc.   Antes          Depois");
        for (int i = 0; i < antes.length; i++) {
            System.out.printf("%-6d  R$ %9.2f  R$ %9.2f%n", i + 1, antes[i], depois[i]);
        }
        System.out.printf("%nAumento total da folha: R$ %.2f%n", aumentoTotal);

        sc.close();
    }
}
