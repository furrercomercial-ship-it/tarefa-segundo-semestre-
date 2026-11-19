package ex06;

import java.util.Scanner;

public class Exercicio06 {
    static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split("\\s+");
        String iniciais = "";

        for (String parte : partes) {
            if (!parte.isEmpty()) {
                iniciais += Character.toUpperCase(parte.charAt(0)) + ".";
            }
        }
        return iniciais;
    }

    static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome completo do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
        sc.close();
    }
}
