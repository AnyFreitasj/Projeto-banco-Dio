import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===================================");
        System.out.println("======= Abertura de Conta =========");
        System.out.println("===================================");
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        double saldo = 2456.90;
        System.out.println("Saldo atual: R$"+ saldo);

        boolean continuar = true;

        while (continuar) {
            System.out.println("===================================");
            System.out.println("======= Escolha uma opção =========");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Sair");
            System.out.println("===================================");
            System.out.println("Por favor, escolha uma opção:");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("===================================");
                    System.out.println("======= Saque na Conta =========");
                    System.out.println("===================================");
                    System.out.println("Por favor, digite o valor que deseja sacar:");
                    double saque = scanner.nextDouble();
                    
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.println("======= Depósito na Conta =========");
                    System.out.println("===================================");
                    System.out.println("Por favor, digite o valor que deseja depositar:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }
        
        scanner.close();

        System.out.println("===================================");
        System.out.println("======= Resumo da Conta ===========");
        System.out.println("===================================");
        
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("===================================");
    }
}
