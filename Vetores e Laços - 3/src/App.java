public class App {
    public static void main(String[] args) throws Exception {

        Sala sala = new Sala(25);

        Aluno a1 = new Aluno("123.312.789-12", 18);
        Aluno a2 = new Aluno("123.121-12", 27);
        Aluno a3 = new Aluno("123.456.213-12", 35);
        // Adiciona um unico aluno
        sala.addAlunos(a1);
        //adiciona varios alunos
        sala.addAlunos(a2,a3);
        sala.mostrarAlunos();
    }
}
