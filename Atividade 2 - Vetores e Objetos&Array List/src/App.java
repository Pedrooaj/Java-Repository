import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto p1 = new Produto("Prod 1");
        produtos.add(p1);
        produtos.remove(p1);
        System.out.println(produtos.size());
        produtos.add(p1);
        System.out.println(produtos.size());
        
    }
}
