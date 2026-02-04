package Model;

import Calculation.Classification;

public class Episode implements Classification {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizações;

    public Episode(int numero, String nome, Serie serie, int totalVisualizações) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
        this.totalVisualizações = totalVisualizações;
    }

    public int getNumero() {
        return numero;
    }

    public Episode setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Episode setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Serie getSerie() {
        return serie;
    }

    public Episode setSerie(Serie serie) {
        this.serie = serie;
        return this;
    }

    public int getTotalVisualizações() {
        return totalVisualizações;
    }

    public Episode setTotalVisualizações(int totalVisualizações) {
        this.totalVisualizações = totalVisualizações;
        return this;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizações>100){
            return 4;
        }else{
            return 2;
        }
    }
}
