import java.util.Scanner;

public class ComparacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scanner.nextInt();
        }

        //diferentes no novo vetor
        int[] vetorDiferenca = encontrarDiferencas(vetor1, vetor2);

        System.out.print("Elementos diferentes: ");
        for (int num : vetorDiferenca) {
            System.out.print(num + " ");
        }
    }

    //elementos diferentes
    public static int[] encontrarDiferencas(int[] vetor1, int[] vetor2) {
        int[] vetorDiferenca = new int[vetor1.length + vetor2.length]; //tamanho max
        int indiceDiferenca = 0;

        for (int i = 0; i < vetor1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vetorDiferenca[indiceDiferenca++] = vetor1[i];
            }
        }

        //elementos do v2 que nao estao em v1
        for (int i = 0; i < vetor2.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                vetorDiferenca[indiceDiferenca++] = vetor2[i];
            }
        }

        //tamanho do vetor
        int[] resultado = new int[indiceDiferenca];
        for (int i = 0; i < indiceDiferenca; i++) {
            resultado[i] = vetorDiferenca[i];
        }

        return resultado;
    }
}
