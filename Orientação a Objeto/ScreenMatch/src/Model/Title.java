package Model;

import Excecao.ErroDeConversaoDeAnoException;
import org.jetbrains.annotations.NotNull;

public class Title implements Comparable<Title>{

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Title(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes ) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public Title(int duracaoEmMinutos, int totalDeAvaliacoes, double somaDasAvaliacoes, boolean incluidoNoPlano, int anoDeLancamento, String nome) {
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.incluidoNoPlano = incluidoNoPlano;
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public Title(TitleOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){
            // Criando a própria exceção
            throw (new ErroDeConversaoDeAnoException("Não consigo converter o ano, porque tem mais de um caractere"));
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.parseInt(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getClassificacao(){
        return 0;
    };

    @Override
    public String toString() {
        return nome + " (" + anoDeLancamento + "), com "+duracaoEmMinutos+" minutos";
    }

    @Override
    public int compareTo(@NotNull Title o) {
        return 0;
    }
}
