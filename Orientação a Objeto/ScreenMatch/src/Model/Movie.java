package Model;

import Calculation.Classification;

public class Movie extends Title implements Classification {
    private String diretor;

    public Movie(int duracaoEmMinutos, int totalDeAvaliacoes, double somaDasAvaliacoes, boolean incluidoNoPlano, int anoDeLancamento, String nome, String diretor) {
        super(duracaoEmMinutos, totalDeAvaliacoes, somaDasAvaliacoes, incluidoNoPlano, anoDeLancamento, nome);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public Movie setDiretor(String diretor) {
        this.diretor = diretor;
        return this;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}