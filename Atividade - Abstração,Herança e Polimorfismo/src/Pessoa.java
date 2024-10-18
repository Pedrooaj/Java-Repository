public class Pessoa {
    public String cpf;
    public String nome;
    public String email;
    public String senha;

    public Pessoa(String cpf, String nome, String email, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void exibir(){
        System.out.println("Esta classe e Pessoa");
    }

}