package Calculation;

import Model.Movie;
import Model.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Movie f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Title titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
