
# BOOTCAMP JAVA 
## Aplicação simples de entrada de dados para cadastro de conta bancária

##### Esta é uma simples aplicação de entrada de dados via terminal.

## Classe ContaTerminal
    Método principal que executa a entrada de dados e exibe as informações da conta.

### Variaveis

|Declaração da variavel | Documentação |
|------------|--------------------------| 
|int numero | Número da conta bancária |
|String agencia|Número da agência bancária|
|String nomeCliente|Nome do cliente|
|double saldo|Saldo da conta|


## Codigo
Scanner para entrada de dados do usuário
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitação e leitura dos dados da conta
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

        //Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
  
  
