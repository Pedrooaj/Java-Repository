public class Funcionario {
    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(String nome, String cpf,double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void bonus(){
        this.salario = (0.05 * this.salario) + this.salario;
    }

}
