public class Conta {
    private final int numeroConta;
    private final String agencia;
    private final String nome;
    private final double saldo;


    public Conta(int numeroConta,String agencia, String nome, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void exibeMensagem(){
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ",");
        System.out.println("conta " + numeroConta);
        System.out.printf("e seu saldo de R$ %.2f já está disponível.\n", saldo);
    }
}
