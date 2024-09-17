public class Funcionario {
    public String nome;
    public int idade;
    public String sexo;
    public Double hora;
    public Double valor;
    public boolean status;

    public Funcionario(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.status = false;
    }

    public Funcionario(String nome, int idade, String sexo, Double valor){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valor = valor;
        this.status = true;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(boolean sexo){
        this.sexo = (sexo == true) ? "M" : "F";
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public void setHoras(Double horas){
        this.hora = horas;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getSexo(){
        return this.sexo;
    }

    public Double getHoras(){
        return this.hora;
    }

    public Double getValor(){
        return this.valor;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void exibirFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Trabalhando: " + this.status);
    }

    public void exibirHoras(){
        System.out.println("Horas trabalhadas: "+this.hora);
    }

    public void calcularSalario(){
        Double salario = 0.0;
        if(this.sexo == "M"){
            salario = this.hora * valor;
        }else if(this.sexo == "F" | this.sexo == "f"){
            salario = (this.hora * valor);
            salario += (salario * 0.2);
        }
        System.out.println("Salario de "+ this.nome + ": " + salario);
        
    }
}
