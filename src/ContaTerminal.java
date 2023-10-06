import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int num;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("BEM VINDO AO MENU CRIACAO DE CONTA\n");
        System.out.println("Informe o número da sua AGÊNCIA: ");
        num = scanner.nextInt();
        System.out.println("Agência: " + num);

    }
}
