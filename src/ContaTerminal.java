import java.util.Objects;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        String agencia = null;
        String nomeCliente = "";
        double saldo = -1;
        String mensagem="";
        System.out.println("Bem vindo ao Banco!");

            System.out.println("Por favor, informe seu nome");
            nomeCliente = scan.next();

            System.out.println("Por favor, informe sua Agência");
            agencia = scan.next();

        while(numero == 0){
            System.out.println("Por favor, informe o número da conta");
            numero = scan.nextInt();
        }
        while(saldo < 0){
            System.out.println("Por favor, confirme seu saldo");
            saldo = scan.nextDouble();
        }
        mensagem = "Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+saldo+" já está disponível para saque";
        System.out.println(mensagem);
        scan.close();

    }
}