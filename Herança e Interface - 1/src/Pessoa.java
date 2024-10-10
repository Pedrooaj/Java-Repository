// Utilizamos implements para realizar o contrato com a interface Actions
public class Pessoa implements Actions {
    public String nome;
    public int idade;
    protected String cpf;

    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public void falar(String fala){
        System.out.println(fala);
    }

    public void exibir(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cpf);
    }

    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
