package br.com.contabanco;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe ContaTerminal representa uma aplicação simples de entrada de dados
 * para cadastro de conta bancária via terminal.
 */
public class ContaTerminal {
    /**
     * Método principal que executa a entrada de dados e exibe as informações da conta.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        int numero; // Número da conta bancária
        String agencia; // Número da agência bancária
        String nomeCliente; // Nome do cliente
        double saldo; // Saldo da conta

        // Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitação e leitura dos dados da conta
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo: ");
        saldo = scanner.nextDouble();

        // Fechamento do scanner
        scanner.close();

        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
