public class Conta {
    public String cpf;
    public double saldo;
    public boolean tipoCliente;

    public void Bonificacao(){

        if(this.tipoCliente == true){
            this.saldo = this.saldo * 1.1;
            System.out.println(this.cpf + ": Foi bonificado em 10% do saldo!!");
        }else{
            this.saldo = this.saldo * 1.05;
            System.out.println(this.cpf + ": Foi bonificado em 5% do saldo!!");
        }
    }

    public void Saque(double valor) {
        System.out.println(cpf + ": Foram sacados " + valor + "R$");
        this.saldo = this.saldo - valor;
    }

    public void Depositar(double valor){
        System.out.println(cpf + ": Foram depositados " + valor + "R$");
        this.saldo = this.saldo + valor;
    }

    public void Transferir(double valor, Object Conta){
        this.saldo = this.saldo - valor;
        ((Conta) Conta).Depositar(valor);
    }
}
