import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //declaração de uma variável
        ContaCorrente conta;

        //instanciar
        conta = new ContaCorrente();

        System.out.println("Digite o saldo R$:");
        conta.saldo = scan.nextDouble();
        //limpando o buffer
        scan.nextLine();
        //conta.saldo = 1212.99;
        System.out.println("Digite o documento:");
        conta.documento = scan.nextLine();
        //conta.documento = "123.456-00";
        System.out.println("Digite a agencia:");
        conta.agencia = scan.nextLine();
        System.out.println("Digite o numero do cartao:");
        conta.numeroCartao = scan.nextLine();
        System.out.println("Digite o numero da conta:");
        conta.numeroConta = scan.nextInt();
        //limpando o buffer
        scan.nextLine();
        System.out.println("Digite a senha:");
        conta.senha = scan.nextLine();

        System.out.println("Saldo R$: "+conta.saldo);
        System.out.println("Documento: "+conta.documento);
        System.out.println("Agencia: "+conta.agencia);
        System.out.println("Numero cartao: "+conta.numeroCartao);
        System.out.println("Numero conta: "+conta.numeroConta);
        System.out.println("Senha: "+conta.senha);


        conta.depositar(160);
        System.out.println("Saldo depois do deposito R$: "+conta.saldo);
        

    }
}
