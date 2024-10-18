public class Professor extends Pessoa implements Auteticavel {
    public String cracha;

    public Professor(String cpf, String nome, String email, String senha, String cracha){
        super(cpf, nome, email, senha);
        this.cracha = cracha;
    }
    @Override
    public boolean auteticavel(String senha){
        return true;
    }



    
}
