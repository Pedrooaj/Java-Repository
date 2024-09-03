public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        p.setNome("Pedro Antonio");
        p.setCpf("123.456.789-10");
        p.setAno(2005);
        p.setAltura(1.68);
        p.exibirDados();
    }
}
