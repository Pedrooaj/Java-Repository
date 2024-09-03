public class Pessoa {
    private String nome;
    private String cpf;
    private int ano;
    private double altura;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public int getAno(){
        return this.ano;
    }

    public double getAltura(){
        return this.altura;
    }

    public int calcularIdade(){
        return 2024 - this.ano;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Altura: " + this.altura);
    }

}

