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


    // metodo para adicionar um unico aluno 
    public void addAluno(Aluno aluno){
        this.alunos[this.indice] = aluno;
        this.indice++;
    }

    // metodo para adicionar varios alunos
    public void addAlunos(Aluno... args){
        for(int i = 0; i < args.length; i++){
            this.addAluno(args[i]);
        }
    }


}
