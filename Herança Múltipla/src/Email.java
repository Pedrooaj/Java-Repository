public class Email implements Seguranca {
    public String nome;
    public String email;
    protected String senha;

    @Override
    public boolean verificarSenha(String senha) {
        if(this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void mensagemFracasso() {
        System.out.println("Falhou");
    }

    @Override 
    public void mensagemSucesso(){
        System.out.println("Sucesso");
    }
}
