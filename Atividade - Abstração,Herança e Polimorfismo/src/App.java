public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor("12312312", "Girafales", "girafales@gmail.com", "123", "12");
        Aluno aluno = new Aluno("12321312", "Pedro", "pedro@gmail.com","123", "123");
        Bolsista bolsista = new Bolsista("23131231", "Bolsista", "Bolsista@gmail.com", "123", "124", 600.0);

        professor.exibir();
        aluno.exibir();
        bolsista.exibir();

    }
}
