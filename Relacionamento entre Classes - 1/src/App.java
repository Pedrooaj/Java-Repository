import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um cpf: ");
        String cpf = scan.nextLine();
        System.out.println("Digite um Endereço: ");
        String endereco = scan.nextLine();

        Cliente cliente = new Cliente(cpf, endereco);
        Conta conta = new Conta(cliente);

        while (true) {
            System.out.println("Deseja fazer alguma operação? \n 1 - Deposito \n 2 - Saque \n 3 - Sair");
            int condition = scan.nextInt();
            if(condition == 1){
                System.out.println("Quanto deseja depositar Deseja depositar?");
                Double deposito = scan.nextDouble();
                conta.depositar(deposito);
            }else if(condition == 2){
                System.out.println("Quanto deseja sacar?");
                Double saque = scan.nextDouble();
                conta.retirar(saque);
            }else{
                break;
            }
        }


        



        scan.close();
    }
}
