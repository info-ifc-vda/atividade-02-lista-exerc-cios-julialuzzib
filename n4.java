import java.util.Scanner;

public class BancoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] codigosContas = new int[10];
        double[] saldosContas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o codigo da conta " + (i + 1) + ": ");
            codigosContas[i] = scanner.nextInt();
            System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
            saldosContas[i] = scanner.nextDouble();
        }

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar deposito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancario (soma de todos os saldos)");
            System.out.println("4. Finalizar programa");
            System.out.print("Digite a opcao desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //deposito
                    System.out.print("Digite o codigo da conta para deposito: ");
                    int codigoDeposito = scanner.nextInt();
                    System.out.print("Digite o valor do deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    int indiceDeposito = encontrarIndice(codigosContas, codigoDeposito);
                    if (indiceDeposito != -1) {
                        saldosContas[indiceDeposito] += valorDeposito;
                        System.out.println("Deposito realizado com sucesso.");
                    } else {
                        System.out.println("Conta nao encontrada.");
                    }
                    break;
                case 2:
                    //saque
                    System.out.print("Digite o codigo da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    int indiceSaque = encontrarIndice(codigosContas, codigoSaque);
                    if (indiceSaque != -1 && saldosContas[indiceSaque] >= valorSaque) {
                        saldosContas[indiceSaque] -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente ou conta nao encontrada.");
                    }
                    break;
                case 3:
                    //consultar ativo bancario
                    double ativoBancario = 0;
                    for (double saldo : saldosContas) {
                        ativoBancario += saldo;
                    }
                    System.out.println("O ativo bancario é: " + ativoBancario);
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        } while (opcao != 4);
    }

    //encontar indice do codigo
    public static int encontrarIndice(int[] codigos, int codigo) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                return i;
            }
        }
        return -1; //se o codigo nao for encontrado
    }
}
