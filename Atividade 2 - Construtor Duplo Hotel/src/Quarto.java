public class Quarto {
    public int numero;
    public String tipo;
    public boolean disponivel;

    public Quarto(String tipo, int numero){
        this.tipo = tipo;
        this.numero = numero;
        this.disponivel = true;
    }
    public Quarto(String tipo, int numero, boolean disponivel){
        this.tipo = tipo;
        this.numero = numero;
        this.disponivel = disponivel;
    }

    public void exibirStatus(){
        if(this.disponivel == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        }

}
