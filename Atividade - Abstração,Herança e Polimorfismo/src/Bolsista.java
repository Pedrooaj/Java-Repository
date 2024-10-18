public final class Bolsista extends Aluno {
    public double bolsa;
    public Bolsista(String cpf, String nome, String email, String senha, String matricula, double bolsa){
        super(cpf, nome, email, senha, matricula);
        this.bolsa = bolsa;
    }
    @Override
    public void exibir(){
        System.out.println("Esta classe e Bolsista");
        System.out.println("Bolsa: " + this.bolsa);
        
    }
}
