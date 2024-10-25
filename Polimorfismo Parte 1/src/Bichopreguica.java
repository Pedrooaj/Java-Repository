public class Bichopreguica extends Animal {
    protected boolean escala;
    public Bichopreguica(String nome, int idade){
        super(nome,idade);
        this.escala = true;
    }

    public void setEscala(boolean escala) {
        this.escala = escala;
    }

    // polimorfismo de sobreposição
    @Override
    public void emiteSom(){
        System.out.println("Som do bicho preguiça");
    }

    public void escala(){
        if(this.escala = true){
            System.out.println("Eu escalo");
        }else{
            System.out.println("Não escala");
        }
    }


}
