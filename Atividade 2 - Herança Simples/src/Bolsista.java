public class Bolsista extends Estudante {
    public double bolsa;

    public Bolsista(int matricula,int ano, String curso, double bolsa){
        super(matricula, ano, curso);
        this.bolsa = bolsa;
    }

    @Override
    public void imprimirFolha(){
        System.out.println("-0.07R$");
        this.bolsa -= 0.07;
    }

    public void folhas(){
        double folhas = this.bolsa / 0.07;
        String result = String.format("%.0f", folhas);
        System.out.println("Você ainda pode imprimir " + result + " folhas");
    }

}
