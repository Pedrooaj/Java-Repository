public class App {
    public static void main(String[] args) throws Exception {
        
        Sala sala = new Sala(25);

        Aluno a1 = new Aluno("123.312.789-12", 18);
        Aluno a2 = new Aluno("123.121-12", 27);
        Aluno a3 = new Aluno("123.456.213-12", 35);
        sala.addAluno(a1);
        sala.addAluno(a2);
        sala.addAluno(a3);
        sala.mostrarAlunos();
    }
}
