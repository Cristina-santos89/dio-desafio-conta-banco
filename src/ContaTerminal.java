import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();
    
        System.out.println("Por favor, digite o número do usuário: ");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, informe o valor depositado: ");
        double valorSaldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agencia é " + numeroAgencia + ", conta " + numeroUsuario + " e seu saldo " + valorSaldo + " já está disponível para saque.");

    }
}
