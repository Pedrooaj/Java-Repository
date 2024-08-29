import java.text.*;

public class Livro {
    public String nome;
    public String autor;
    public int anoPub;
    public int exDispo;

    public Livro(String nome, String autor, int anoPub, int exDispo){
        this.nome = nome;
        this.autor = autor;
        this.anoPub = anoPub;
        this.exDispo = exDispo;
    }

    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
        this.anoPub = 2024;
        this.exDispo = 1;
    }

    public String exibirLivro(){
        DecimalFormat df = new DecimalFormat("#");
        String stringLivro = MessageFormat.format("Livro: {0} \nAutor: {1} \nAno de publicacao: {2} \nQuantidade Disponivel: {3}", 
        this.nome, this.autor, df.format(this.anoPub), df.format(this.exDispo));

        return stringLivro;
        
    }

}
