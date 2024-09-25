public class Carrinho {
    public Produto[] produtos;
    public int indice;

    public Carrinho(int tamanho){
        this.produtos = new Produto[tamanho];
        this.indice = 0;
    }

    public int tamanho(){
        return this.produtos.length;
    }

    public void calcularMedia() {
        // calcula a media entre os pesos
        Double media = 0.0;
        for (int i = 0; i < this.produtos.length; i++) {
            media += this.produtos[i].peso;
        }
        double length = this.produtos.length;
        media = media / length;
        System.out.println("\nA media dos pesos e: " + media);
    }

    public void calcularPesoEpreco() {
        // Diz quantos produtos tem o preço menor que 50 e peso maior que 10
        int contador = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i].peso > 10.0 && this.produtos[i].valor < 50.0) {
                contador++;
            }
        }
        System.out.println("\nProdutos com peso Maior que 10 & preço -50.0 R$: " + contador);
    }

    public void maisLeve() {
        // Pega o produto mais leve
        Double peso = this.produtos[0].peso;
        int indice = 0;
        for (int i = 0; i < this.produtos.length; i++) {
            if (produtos[i].peso < peso) {
                peso = this.produtos[i].peso;
                indice = i;
            }
        }
        System.out.println("Produto mais leve:");
        this.produtos[indice].exibirProduto();
    }

    public void maisCaro(){
        // pega o produto mais caro
        Double valor = this.produtos[0].valor;
        int indice = 0;
        for(int i = 0; i < this.produtos.length;i++){
            if(this.produtos[i].valor > valor){
                valor = this.produtos[i].valor;
                indice = i;
            }
        }
        System.out.println("Produto mais caro: ");
        this.produtos[indice].exibirProduto();
    }


    public void mediaMaior10() {
        // calcula a media entre os pesos
        Double media = 0.0;
        Double length = 0.0;
        for (int i = 0; i < this.produtos.length; i++) {
            if(this.produtos[i].peso > 10.0){
                media += this.produtos[i].valor;
                length++;
            }
        }
        media = media / length;
        System.out.println("\nA media dos valores com pesos maiores que 10 e: " + media);
    }

}
