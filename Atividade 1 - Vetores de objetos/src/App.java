import java.util.*;

public class App {
    public static void main(String[] args){

        Carrinho carrinho = new Carrinho(3);


        
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < carrinho.tamanho(); i++){
            System.out.println("Digite o Peso do Produto " + i + " :");
            double peso = scanner.nextDouble();
            System.out.println("Digite o Valor do Produto " + i + " :");
            double valor = scanner.nextDouble();
            String id = Integer.toString(i);   
            Produto produto = new Produto(id, peso, valor);
            carrinho.produtos[i] = produto;
        }
        scanner.close();

        carrinho.maisLeve();
        carrinho.calcularMedia();
        carrinho.calcularPesoEpreco();
        carrinho.maisCaro();
        carrinho.mediaMaior10();


        
    
    }
}
