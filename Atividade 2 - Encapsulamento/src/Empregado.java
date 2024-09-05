public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salario;

    public Empregado(String nome, String sobrenome, Double salario) {
        setNome(sobrenome);
        setSobrenome(sobrenome);
        setSalario(salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(Double salario) {
        this.salario = (salario < 0.0) ? salario = 0.0 : salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public Double getSalario(){
        return this.salario * 12;
    }


    public void aumento(){
        this.salario = (this.salario * 0.1) + this.salario;
    }
}
