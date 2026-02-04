package Model;

public class Music extends Audio{
    private String musicAlbum;
    private String musicArtist;
    private String musicGenre;

    // construtor
    public Music(String title, int duration, String musicAlbum, String musicArtist, String musicGenre) {
        super(title, duration);
        this.musicAlbum = musicAlbum;
        this.musicArtist = musicArtist;
        this.musicGenre = musicGenre;
    }

    // Getters e Setters
    public String getMusicAlbum() {
        return musicAlbum;
    }

    public Music setMusicAlbum(String musicAlbum) {
        this.musicAlbum = musicAlbum;
        return this;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public Music setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
        return this;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public Music setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }
}
