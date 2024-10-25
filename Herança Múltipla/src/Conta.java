public class Conta implements Seguranca {
    private String cpf;
    private String senha;
    private double saldo;

    @Override
    public boolean verificarSenha(String senha) {
        if(this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void mensagemSucesso(){
        System.out.println("Operação efetuada");
    }

    @Override
    public void mensagemFracasso(){
        System.out.println("Operação Falhou");
    }



    public void sacar(double valor){
        if(verificarSenha(senha)){
            this.saldo -= valor;
            mensagemSucesso();
        }else{
            mensagemFracasso();
        }
    }

    public void depositar(double valor){
        if(!verificarSenha(senha)){
            this.saldo += valor;
            mensagemSucesso();
        }else{
            mensagemFracasso();
        }
    }
}
