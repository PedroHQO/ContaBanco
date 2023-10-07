import java.util.Scanner; //Importando a classe que vai tornar possivel entrada pelo o teclado

public class ContaTerminal{
    public static void main(String[] args) throws Exception{
        //Essa classe (try) é para se caso houver erro, ela ignora e executa o comando dentro
        //Atribuiçao da classe Scanner com seu codigo obrigatorio para tornar possivel executar
        try (Scanner leitor = new Scanner(System.in)) {

        //Definição de variaveis
            int num;
            String agencia;
            String nome;
            Double saldo;

            System.out.println("BEM VINDO AO MENU CRIACAO DE CONTA\n");
            //Solicita a leitura atraves do Scanner e grava de acordo com a variavel escolhida
            System.out.println("Informe o número da sua AGÊNCIA: ");
            num = leitor.nextInt();
            System.out.println("Informe o número da CONTA: ");
            agencia = leitor.next();

            leitor.nextLine(); /*Esvaziando o buffer do teclado, necessario pois 
                                estou trabalhando com int e String*/

            System.out.println("Informe seu NOME completo: ");
            nome = leitor.nextLine();//nextLine é para quando se usa Strings com espaçamento
            System.out.println("Informe seu SALDO atual: ");
            saldo = leitor.nextDouble();

            System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco");
            System.out.println("Sua agência é: " + agencia);
            System.out.println("Sua conta é: " + num);
            System.out.println("Seu saldo $" + saldo + " já está disponível para saque.");
        }


    }
}
