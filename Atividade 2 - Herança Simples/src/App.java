public class App {
    public static void main(String[] args) throws Exception {
        Estudante e = new Estudante(123, 2020, "Analise e Desenvolvimento de Sistemas");
        Bolsista b = new Bolsista(1234, 2018, "Ciencias da Computação", 600);

        e.imprimirFolha();
        b.imprimirFolha();
    }
}
