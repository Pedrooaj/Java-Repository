public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();

        p.setNome("Pedro Antonio");
        p.setIdade(18);

        System.out.printf("%s %d", p.getNome(), p.getIdade());
        System.out.println();
    }
        
}
