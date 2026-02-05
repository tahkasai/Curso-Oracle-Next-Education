package Model;

import org.jetbrains.annotations.NotNull;

public class Movie extends Title implements Comparable<Title> {
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

    @Override
    public String toString() {
        return  this.getNome() +
                " de " + this.getAnoDeLancamento();
    }

    @Override
    public int compareTo(@NotNull Title outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}