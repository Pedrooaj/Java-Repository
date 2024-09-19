public class Aluno {
    public String cpf;
    public int idade;

    public Aluno(String cpf, int idade){
        this.cpf = cpf;
        this.idade = idade;
    }

    public void mostrarInfo(){
        System.out.println("Cpf: " + this.cpf +" Cpf: "+this.idade);
    }
}
