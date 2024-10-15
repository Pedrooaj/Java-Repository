public class Presidente extends Funcionario {
    public int acoes;
    public Presidente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public void bonus(){
        this.salario = (0.1 * this.salario) + this.salario;
    }




}
