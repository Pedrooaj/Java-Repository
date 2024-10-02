public class Cliente {
    private String cpf;
    private String endereco;

    public Cliente(String cpf, String endereco){
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void exibir(){
        System.out.println(this.cpf + " " + this.endereco);
    }
}
