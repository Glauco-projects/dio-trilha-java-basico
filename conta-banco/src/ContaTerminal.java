import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta corrente: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        double saldo = 12000.00;
        
        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + " conta " + numero + "e seu saldo " + String.format("%.2f", saldo) + 
        " já está disponível para saque.");

        scanner.close();
    }
}
