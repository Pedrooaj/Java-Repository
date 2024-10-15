public class Estudante {
    public int matricula;
    public int ano;
    public String curso;

    public Estudante(int matricula,int ano,String curso){
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getAno() {
        return ano;
    }
    public String getCurso() {
        return curso;
    }
    public int getMatricula() {
        return matricula;
    }
    
    public void imprimirFolha(){
        System.out.println("-0.10R$");
    }
}
