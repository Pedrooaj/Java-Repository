public class App {
    public static void main(String[] args) throws Exception {
        Empregado pessoa1 = new Empregado("Pedro", "Lemos", 7000.0);
        Empregado pessoa2 = new Empregado("Luiz", "Lemos", 7000.0);
        pessoa1.aumento();
        System.out.println(pessoa1.getSalario());
        System.out.println(pessoa2.getSalario());
    }
}
