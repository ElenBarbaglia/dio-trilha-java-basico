import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da sua conta:");
        var conta = scanner.next();
        System.out.println("Por favor, digite o número da sua agência:");
        var agencia = scanner.next();
        System.out.println("Por favor, digite o seu nome:");
        var nome = scanner.next();
        System.out.println("Por favor, digite o saldo inicial da conta:");
        var saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,conta %s e seu saldo de R$%s já está disponível para saque.",nome, agencia, conta, saldo);
        }
}
