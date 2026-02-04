package Model;

public class Serie extends Title{
    private int temporadas;
    private int episodios;
    private boolean ativa;
    private int minutosPorSerie;

    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int temporas, int episodios, boolean ativa, int minutosPorSerie) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes);
        this.temporadas = temporas;
        this.episodios = episodios;
        this.ativa = ativa;
        this.minutosPorSerie = minutosPorSerie;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public Serie setTemporadas(int temporadas) {
        this.temporadas = temporadas;
        return this;
    }

    public int getEpisodios() {
        return episodios;
    }

    public Serie setEpisodios(int episodios) {
        this.episodios = episodios;
        return this;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public Serie setAtiva(boolean ativa) {
        this.ativa = ativa;
        return this;
    }

    public int getMinutosPorSerie() {
        return minutosPorSerie;
    }

    public Serie setMinutosPorSerie(int minutosPorSerie) {
        this.minutosPorSerie = minutosPorSerie;
        return this;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodios * minutosPorSerie;
    }
}
