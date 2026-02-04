package Model;

public class episode {
    private int numero;
    private String nome;
    private Serie serie;

    public episode(int numero, String nome, Serie serie) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public episode setNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public episode setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Serie getSerie() {
        return serie;
    }

    public episode setSerie(Serie serie) {
        this.serie = serie;
        return this;
    }
}
