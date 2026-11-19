package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mesma ordem: codigos[i] corresponde a precos[i]
        int[] codigos = {101, 102, 103, 104, 105};
        double[] precos = {5.50, 12.90, 8.75, 30.00, 2.99};

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                posicao = i;
                break;
            }
        }

        if (posicao >= 0) {
            System.out.printf("Preço: R$ %.2f%n", precos[posicao]);
        } else {
            System.out.println("Produto não cadastrado");
        }

        sc.close();
    }
}
