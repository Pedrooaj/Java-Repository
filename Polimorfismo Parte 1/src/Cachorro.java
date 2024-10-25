public class Cachorro extends Animal {
    private boolean corre;

    public Cachorro(String nome, int idade){
        super(nome, idade);
        this.corre = true;
    }

    public void setCorre(boolean corre) {
        this.corre = corre;
    }

    @Override
    public void emiteSom(){
        System.out.println("Au au");
    }

    public void corre(){
        if(this.corre == true){
            System.out.println("Eu corro");
        }else{
            System.out.println("Não corro");
        }
    }

}
