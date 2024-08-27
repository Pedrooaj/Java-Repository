public class Pessoa {
    public String nome;
    public Double altura;
    public Double peso;
    public int nascimento;
    
    public Pessoa(String nome, Double altura, Double peso, int nascimento ){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.nascimento = nascimento;
    }

    public Double calcularImc(){
        return this.peso / (this.altura * this.altura);
    }

}
