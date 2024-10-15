public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario f = new Funcionario("Sla", "1231231", 1000);
        Presidente p = new Presidente("Presidente", "213121231", 1000);

        f.bonus();
        p.bonus();
        System.out.println(f.getSalario());
        System.out.println(p.getSalario());
    }
}
