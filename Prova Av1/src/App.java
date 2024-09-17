public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Pedro", 18, "M");
        Funcionario f2 = new Funcionario("Ana", 30, "F", 7.50);

        f2.setHoras(40.0);
        f1.setHoras(40.0);
        f1.setValor(7.50);
        f2.calcularSalario();
        f1.calcularSalario();
        f1.exibirFuncionario();
        f2.exibirFuncionario();
        
        

    }
}
