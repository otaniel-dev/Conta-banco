import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numeroConta = 0;
        String agencia = "";
        String nome = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Bem vindo ao OTO BANK! Qual o seu nome?: ");
        nome = scanner.next();

        System.out.print("Certo "+nome+", agora me informa uma agência: ");
        agencia = scanner.next();

        System.out.print("Perfeito "+nome+", um número de conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Para finalizar-mos, me informa o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá "+nome+", obrigado por criar uma conta em nosso banco! Sua agência é "+agencia+", conta "+numeroConta+" e seu saldo de R$ "+saldo+" já está disponível!");
    }
}