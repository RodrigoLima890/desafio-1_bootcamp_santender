import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por Favor, digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por Favor, digite o número da agência: ");
        numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Por Favor, digite o nome da sua agência: ");
        agencia = scan.nextLine();

        System.out.print("Por Favor, digite o seu saldo atual: ");
        saldo = scan.nextDouble();
        scan.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);

    }
}
