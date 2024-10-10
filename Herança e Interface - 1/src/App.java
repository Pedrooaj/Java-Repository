public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Pedro", 18, "123.123.123-12", 1125212);
        Pessoa p1 = new Pessoa("pessoa", 29, "231312.131231");

        p1.falar("Pessoa acabou de falar");
        a1.falar("Aluno acabou de falar");

        p1.exibir();
        a1.exibir();
    
    }
}
