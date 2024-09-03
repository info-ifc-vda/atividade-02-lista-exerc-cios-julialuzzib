import java.util.Scanner;

public class CalculadoraCuboRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorLinhas = 0;

        System.out.println("Digite os números (negativo ou 0 para parar):");

        while (true) {
            double numero = scanner.nextDouble();

            if (numero <= 0) {
                break;
            }

            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);

            System.out.printf("%-10s %-15s %-15s\n", "Número", "Cubo", "Raiz Quadrada"); //cabecalho 20 linhas
            System.out.printf("%-10.2f %-15.2f %-15.2f\n", numero, cubo, raizQuadrada);

            contadorLinhas++;
            if (contadorLinhas % 20 == 0) {
                System.out.println(); //linha em branco 20 linhas
            }
        }

        scanner.close();
    }
}
