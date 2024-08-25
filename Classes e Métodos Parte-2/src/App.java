public class App {
    public static void main(String[] args) throws Exception {
        Conta Conta = new Conta();
        Conta Conta2 = new Conta();
        
        Conta2.cpf = "123.454.789-20";
        Conta2.saldo = 0;

        Conta.cpf = "123.456.789-20";
        Conta.saldo = 5000;
        Conta.tipoCliente = true;

        Conta.Bonificacao();
        System.out.println(Conta.saldo);
        Conta.Saque(150.50);
        
        System.out.println(Conta.saldo);
        
        Conta.Depositar(150.50);
        System.out.println(Conta.saldo);
        
        Conta.Transferir(100, Conta2);
        System.out.println(Conta2.saldo);
    }
}
