public class Aluno {
    private String matricula;
    private String nome;
    
    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setmatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getmatricula(){
        return this.matricula;
    }

    public void exibir(){
        System.out.println(this.matricula + " - " + this.nome);
    }
}
