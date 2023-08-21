import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numeroConta;
        String nomeCliente;
        String agencia;
        Double saldo;

        System.out.println("Digite o número da conta:");
        numeroConta = Integer.parseInt(input.nextLine());
        //numeroConta = input.nextInt();
        //input.nextLine(); //quebra de linha.
    
        System.out.print("Digite o número da agência:\n");
        agencia = input.nextLine();

        System.out.println("Digite o seu nome:");
        nomeCliente = input.nextLine();

        System.out.println("Digite o seu Saldo: ");
        saldo = input.nextDouble();

        System.out.printf("Olá %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$%.2f já está disponivel para saque", 
        nomeCliente, agencia, numeroConta, saldo);
    }
}
