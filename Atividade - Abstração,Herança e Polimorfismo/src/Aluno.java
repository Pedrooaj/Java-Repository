public class Aluno extends Pessoa implements Auteticavel {
    public String matricula;

    public Aluno(String cpf, String nome, String email, String senha, String matricula){
        super(cpf, nome, email, senha);
        this.matricula = matricula;
    }
    @Override
    public boolean auteticavel(String senha){
        return true;
    }
    @Override
    public void exibir(){
        System.out.println("Esta classe e Aluno");
        System.out.println("Matricula: " + this.matricula);
    }

    public void pagarMensalidade(){
        System.out.println("pagar mensalidade!");
    }
    public boolean pagarMensalidade(boolean a){
        return a;
    }
}
