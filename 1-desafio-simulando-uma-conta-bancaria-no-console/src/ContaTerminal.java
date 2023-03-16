import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 0;
        String  agencia, nomeCliente;
        Double saldo = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        agencia = scanner.next();
        
        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        
        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.next();
        
        System.out.print("Digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + ", conta " + numero + " e seu saldo R$ ");
        System.out.printf("%.2f já está disponível para saque.\n", saldo); 

    }
}
