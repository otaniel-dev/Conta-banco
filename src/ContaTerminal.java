public void main(String[] args) {
    String nome = "";
    String agencia = "";
    int numeroConta = 0;
    double saldo = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Olá! Qual seria o seu nome?: ");
    nome = scanner.next();

    System.out.print("Por favor, digite o número desejado para ser sua agência: ");
    agencia = scanner.next();

    System.out.print("Agora o número da conta: ");
    numeroConta = scanner.nextInt();

    System.out.print("Agora informe o saldo da sua conta: ");
    saldo = scanner.nextDouble();

    System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo de R$ "+saldo+" já está disponível!");
}