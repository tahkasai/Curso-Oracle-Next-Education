import Calculation.CalculadoraDeTempo;
import Model.Movie;
import Model.Serie;

public class Main {
    public static void main(String[] args) {
        Serie itACoisa = new Serie("Bem vindo a Derry",2025,true,50,5,1,9,true,100);
        Movie osOutros = new Movie(110,760,10,false,2001,"Os outros","Alejandro Amenábar");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(osOutros);
        calculadora.inclui(itACoisa);

        System.out.println("Sua lista\n-------------------------\n"+itACoisa.getNome()+"\n"+osOutros.getNome()+"\nDuração total: "+calculadora.getTempoTotal()+" minutos");


    }
}