public class Conta {
    private Cliente cliente;
    private Double saldo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void retirar(Double valor){
        if(this.saldo - valor > 0){
            this.saldo -= valor;
        }
        System.out.println("Seu valor atual apos o saque e: " + this.saldo);
    }

    public void depositar(Double valor){
        this.saldo += valor;
        System.out.println("Seu valor atual apos o deposito e: " + this.saldo);
    }


    public void exibir(){
        System.out.println(this.cliente + " Saldo Disponivel: " + this.saldo);
    }
}