import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Variáveis do tipo texto para apresenta a mensagem final ao usuário. 
        String textoUm = "Olá "; 
        String textoDois = ", obrigado por criar uma conta em nosso banco, sua agencia é ";
        String textoTres = ", conta ";
        String textoQuatro = " e seu saldo R$ ";
        String textoCinco = " já está disponível para saque.";

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();
    
        System.out.println("Por favor, digite o número do usuário: ");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, informe o valor de depósito: ");
        double valorSaldo = scanner.nextDouble();

        System.out.println(textoUm.concat(nomeCliente).concat(textoDois).concat(numeroAgencia).concat(textoTres) + numeroUsuario + textoQuatro + valorSaldo + textoCinco);
    }
}
