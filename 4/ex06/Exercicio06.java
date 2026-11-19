package ex06;

import java.util.Scanner;

public class Exercicio06 {

    static void mostrarFila(int[] senhas, boolean[] idoso) {
        System.out.print("Fila: ");
        for (int i = 0; i < senhas.length; i++) {
            System.out.print(senhas[i] + (idoso[i] ? "(I)" : "") + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] senhas = new int[10];
        boolean[] idoso = new boolean[10];

        for (int i = 0; i < senhas.length; i++) {
            System.out.print("Senha da posição " + (i + 1) + ": ");
            senhas[i] = sc.nextInt();
            System.out.print("  É idoso? (1 = sim, 0 = não): ");
            idoso[i] = sc.nextInt() == 1;
        }

        System.out.println("\nFila inicial (I = idoso)");
        mostrarFila(senhas, idoso);

        for (int atendimento = 1; atendimento <= 3; atendimento++) {
            // procura o primeiro idoso (senha 0 = posição vazia)
            int escolhido = -1;
            for (int i = 0; i < senhas.length; i++) {
                if (senhas[i] != 0 && idoso[i]) {
                    escolhido = i;
                    break;
                }
            }
            // se não houver idoso, chama a primeira senha da fila
            if (escolhido == -1) {
                for (int i = 0; i < senhas.length; i++) {
                    if (senhas[i] != 0) {
                        escolhido = i;
                        break;
                    }
                }
            }

            if (escolhido == -1) {
                System.out.println("\nFila vazia, ninguém para atender.");
                break;
            }

            System.out.println("\nAtendimento " + atendimento + ": senha " + senhas[escolhido]);

            // quem está atrás anda uma posição
            for (int i = escolhido; i < senhas.length - 1; i++) {
                senhas[i] = senhas[i + 1];
                idoso[i] = idoso[i + 1];
            }
            // a última posição fica 0
            senhas[senhas.length - 1] = 0;
            idoso[idoso.length - 1] = false;

            mostrarFila(senhas, idoso);
        }

        sc.close();
    }
}
