package Model;

public class Podcast extends Audio{
    private String host;
    private String description;

    // Construtor
    public Podcast(String title, int duration, String host, String description) {
        super(title, duration);
        this.host = host;
        this.description = description;
    }

    // Getters e Setters
    public String getHost() {
        return host;
    }

    public Podcast setHost(String host) {
        this.host = host;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Podcast setDescription(String description) {
        this.description = description;
        return this;
    }
}
