public class App {
    public static void main(String[] args) throws Exception {
        Pessoa Pedro = new Pessoa("Pedro Antônio", 1.70, 65.0, 2005);
        System.out.println(String.format("%.2f", Pedro.calcularImc()));
        System.out.println(Pedro);
    }
}
