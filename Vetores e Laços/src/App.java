public class App {
    public static void main(String[] args) throws Exception {
        
        // Vetor de números inteiros com até 5 elementos.
        int[] vetor = new int[5];
        
        // Vetor de Strings.
        String[] nomes = {"Pedro", "Antonio"};
    
        // Alterar elementos do array.
        nomes[0] = "Joao";

        // Loop / Laço "For"
        for(int i = 0; i < nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
