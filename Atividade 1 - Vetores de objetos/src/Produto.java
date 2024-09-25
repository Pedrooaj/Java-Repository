public class Produto {
    public String id;
    public Double peso;
    public Double valor;

    public Produto(String id, Double peso, Double valor){
        this.id = id;
        this.peso = peso;
        this.valor = valor;
    }

    public void exibirProduto(){
        System.out.println("Id: " + this.id + " Peso: " + this.peso + " Valor: " + this.valor);
    }


}
