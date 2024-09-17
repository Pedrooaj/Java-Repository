import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[3];

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite um nome: ");
            String nome = scan.nextLine();
            nomes[i] = nome;
        }

        String sla = "";

        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].length() > sla.length()){
                sla = nomes[i];
            }
        }

        System.out.println(sla);
        scan.close();
    }
}
