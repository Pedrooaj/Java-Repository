import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Informe o valor para a posicao "+ i + ":");
        numeros[i] = scanner.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            soma+=numeros[i];
        }
        System.out.println("A soma é: " + soma);
        scanner.close();
    }
}

