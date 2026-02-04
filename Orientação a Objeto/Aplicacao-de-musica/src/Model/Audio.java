package Model;

public class Audio {
    private String title;
    private int duration; // seconds
    private int reproductions; // total reproductions
    private int likes; // total likes

    // Construtor
    public Audio() {

    }

    public Audio(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Setters
    public Audio setTitle(String title) {
        this.title = title;
        return this;
    }

    public Audio setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getReproductions() {
        return reproductions;
    }

    public int getLikes() {
        return likes;
    }

    // Methods
    public void like(){
        this.likes++;
    }

    public void reproduction(){
        this.reproductions++;
    }

}
