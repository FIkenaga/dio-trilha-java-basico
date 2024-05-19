
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

     
        Scanner scan = new Scanner(System.in);

    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;


    System.out.println("Digite o nome do cliente: ");

            nomeCliente = scan.nextLine();
            System.out.println("Digite o número da agência: ");

            agencia = scan.nextLine();

            System.out.println("Digite o número da conta: ");
            numeroConta = scan.nextInt();

            System.out.println("Digite o saldo do cliente: ");
            saldo = scan.nextDouble();


            System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, o número da sua agencia é "
            + agencia + " e sua conta número " + numeroConta + " está com saldo de " + saldo);

    } 




}
