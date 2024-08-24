public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pedro = new Pessoa();

        pedro.nome = "Pedro Antonio";
        pedro.altura = 1.70;
        pedro.peso = 70.0;
        pedro.ano = 2005;

        System.out.println("Nome: " +pedro.nome);
        System.out.println("Nascimento: " + pedro.ano);
        System.out.println("Altura: " + pedro.altura);
        System.out.println("Peso: " + pedro.peso);
        pedro.Imc();
        pedro.Idade();
    }
}
