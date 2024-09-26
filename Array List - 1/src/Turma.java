import java.util.ArrayList;

public class Turma {
    private String id;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String id, Professor prof){
        this.id = id;
        this.professor = new Professor(prof.getNome());
        this.alunos = new ArrayList<>();
    }

    public void setId(String id){
        this.id = id;
    }

    public void setProfessor(String nome){
        this.professor.setNome(nome); 
    }   

    public String getId(){
        return this.id;
    }

    public String getProfessor(){
        return this.professor.getNome();
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void exibirAlunos(){
        for(int i = 0; i < alunos.size();i++){
            Aluno aluno = alunos.get(i);
            aluno.exibir();
        }
    }

}
