import java.util.Scanner;

public class AnaliseMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[7][7];
        int[] maioresPorLinha = new int[7];
        int[] menoresPorColuna = new int[7];

        //preencher matriz
        System.out.println("Digite os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        //maior elemento linha e menor de cada coluna
        for (int i = 0; i < 7; i++) {
            maioresPorLinha[i] = matriz[i][0];
            menoresPorColuna[i] = matriz[0][i];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maioresPorLinha[i]) {
                    maioresPorLinha[i] = matriz[i][j];
                }
                if (matriz[j][i] < menoresPorColuna[i]) {
                    menoresPorColuna[i] = matriz[j][i];
                }
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Maiores elementos de cada linha: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(maioresPorLinha[i] + " ");
        }
        System.out.println();

        System.out.print("Menores elementos de cada coluna: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(menoresPorColuna[i] + " ");
        }
    }
}
