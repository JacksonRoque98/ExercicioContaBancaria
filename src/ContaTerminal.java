import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe SCANNER
        //TODO:Exibir as mensagens para o nosso usuário
        //TODO:Obter pela classe Scanner os valores digitados
        //TODO:Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        String nomeDoCliente;
        String agencia;
        Integer numeroDaConta;
        double saldo;

        System.out.println("Qual o nome do cliente? ");
        nomeDoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agência :");
        agencia = scanner.nextLine();

        System.out.println("Qual o número da conta? ");
        numeroDaConta = Integer.parseInt(scanner.nextLine());

        System.out.println("E qual o saldo que deseja depositar na sua conta? ");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, \nsua Agência é: "+
                agencia+", o número da sua conta é: "+numeroDaConta+", e o seu saldo de R$"+saldo+
               ", já está disponivel para saque!");

    }
}