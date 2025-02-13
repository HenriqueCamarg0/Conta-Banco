import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação de dados iniciais
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        scanner.nextLine();  // Consumir a linha pendente

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        scanner.nextLine();  // Consumir a linha pendente

        // Mensagem de boas-vindas com os dados da conta
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                          + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        boolean continuar = true;

        // Loop para acessar a conta ou sair
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Acessar conta");
            System.out.println("2 - Sair");

            int escolha = scanner.nextInt();
            if (escolha == 1) {
                // Loop para operações bancárias
                while (continuar) {
                    System.out.println("\nEscolha uma operação:");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Sair");

                    int opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            // Operação de depósito
                            System.out.println("Digite o valor para depósito:");
                            double deposito = scanner.nextDouble();
                            saldo += deposito;
                            System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
                            break;
                        case 2:
                            // Operação de saque
                            System.out.println("Digite o valor para saque:");
                            double saque = scanner.nextDouble();
                            if (saque <= saldo) {
                                saldo -= saque;
                                System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
                            } else {
                                System.out.println("Saldo insuficiente para saque!");
                            }
                            break;
                        case 3:
                            // Encerrar o loop e sair
                            continuar = false;
                            System.out.println("Obrigado por usar nossos serviços! Tenha um ótimo dia.");
                            break;
                        default:
                            // Opção inválida
                            System.out.println("Opção inválida. Por favor, tente novamente.");
                    }
                }
            } else if (escolha == 2) {
                // Sair do programa
                continuar = false;
                System.out.println("Obrigado por usar nossos serviços! Tenha um ótimo dia.");
            } else {
                // Opção inválida
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}