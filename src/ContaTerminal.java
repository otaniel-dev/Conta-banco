import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Bem vindo ao OTO BANK! Qual o seu nome?: ");
        String nome = scanner.nextLine();

        System.out.print("Certo "+nome+", agora me informa uma agência: ");
        String agencia = scanner.next();

        System.out.print("Perfeito "+nome+", um número de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Para finalizar-mos, me informa o saldo da conta: ");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(numeroConta, agencia, nome, saldo);

        conta.exibeMensagem();

        scanner.close();
    }
}