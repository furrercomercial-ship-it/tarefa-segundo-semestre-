package ex05;

import java.util.Scanner;

public class Exercicio05 {
    static int contarVogais(String texto) {
        int quantidade = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if ("aeiouáéíóúâêôãõ".indexOf(letra) >= 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    static void exibirContagem(String[] frases) {
        for (String frase : frases) {
            System.out.println(frase + " -> " + contarVogais(frase) + " vogais");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª palavra ou frase: ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
        sc.close();
    }
}
