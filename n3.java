import java.util.Scanner;

public class OperacoesComVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int[] vetorResultadoSoma = new int[10];
        int[] vetorResultadoDivisores = new int[10];

        System.out.println("Digite os elementos do primeiro vetor (10 números):");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor (5 números):");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int somaVetor2 = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 == 0) {
                //se o número e par, soma todos os elementos do segundo vetor
                somaVetor2 = 0;
                for (int j = 0; j < 5; j++) {
                    somaVetor2 += vetor2[j];
                }
                vetorResultadoSoma[i] = somaVetor2;
            }

            if (vetor1[i] % 2 != 0) {
                //se o n e impar, conta os divisores no segundo vetor
                int contaDivisores = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        contaDivisores++;
                    }
                }
                vetorResultadoDivisores[i] = contaDivisores;
            }
        }

        System.out.println("Vetor resultado da soma dos pares com todos os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultadoSoma[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor resultado da quantidade de divisores de cada ímpar do primeiro vetor no segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultadoDivisores[i] + " ");
        }
    }
}
