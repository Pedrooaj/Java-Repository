public class Aluno extends Pessoa { 
    private int matricula;
    
    public Aluno(String nome, int idade, String cpf, int matricula){
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    // @Override serve para sobrepor e garantir que o metodo e da propia classe e não de uma classe herdada
    @Override 
    public void exibir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.matricula);
        System.out.println(this.cpf);
    }
}
