import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        // instanciando cachorro de forma polimorfica
        Animal cachorro = new Cachorro("Cachorro", 12); 
        Bichopreguica b1 = new Bichopreguica("Bicho preguiça", 1);
        Cachorro c1 = new Cachorro("Catiorro", 1);

        ArrayList<Animal> cadastros = new ArrayList<>();

        cadastros.add(cachorro);
        cadastros.add(c1);
        cadastros.add(b1);

        int count = 0;

        for(Animal animal: cadastros){   
            count += animal.getIdade();
        }

        count = count / cadastros.size();

        System.out.println(count);
        
        c1.emiteSom();
        b1.emiteSom();
        cachorro.emiteSom();    

    }
}
