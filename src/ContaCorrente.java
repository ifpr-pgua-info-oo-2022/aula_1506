public class ContaCorrente {
    
    //atributos
    double saldo;
    String agencia;
    String documento;
    String numeroCartao;
    String senha;
    int numeroConta;

    void depositar(double valor){
        saldo = saldo + valor;
    }



}
