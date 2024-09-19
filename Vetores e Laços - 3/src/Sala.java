public class Sala {
    public Aluno[] alunos;
    public int indice;

    public Sala(int tamanho){
        this.alunos = new Aluno[tamanho];
        this.indice = 0;
    }

    public void mostrarAlunos(){
        for(int i = 0; i < this.indice; i++){
            alunos[i].mostrarInfo();
        }
    }

    public void addAluno(Aluno aluno){
        this.alunos[this.indice] = aluno;
        this.indice++;
    }
}
