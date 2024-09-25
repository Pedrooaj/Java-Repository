import java.util.*;
public class Pessoa {
    public String nome;
    public int ano;
    public double peso;
    public double altura;

    public void Imc(){
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + String.format("%.2f",imc));
    }

    public void Idade(){
        Date data = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        int Ano = calendar.get(Calendar.YEAR);
        System.out.println("Idade: " + (Ano - this.ano));
    }
}
