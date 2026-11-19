package ex08;

public class Exercicio08 {
    static boolean contem(int[] numeros, int valor) {
        for (int numero : numeros) {
            if (numero == valor) return true;
        }
        return false;
    }

    static int[] sortear(int quantidade, int maximo) {
        int[] numeros = new int[quantidade];
        int i = 0;

        while (i < quantidade) {
            int sorteado = (int) (Math.random() * maximo) + 1;
            if (!contem(numeros, sorteado)) {
                numeros[i] = sorteado;
                i++;
            }
        }
        return numeros;
    }

    static void exibir(int[] numeros) {
        System.out.print("Números sorteados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] resultado = sortear(6, 60);
        exibir(resultado);
    }
}
