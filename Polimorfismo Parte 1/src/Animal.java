public class Animal  {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    protected void emiteSom(){
        System.out.println("Emite som");
    };


    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
