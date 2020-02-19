package pojos;

public abstract class Song {

    protected Artist artist;
    protected String name;
    protected Source source;


    public Song(String name, Artist artist){
        this.name=name;
        this.artist=artist;
    }

    public Song(String name, Artist artist, Source source){
        super();
        this.source=source;
    }

    /**
     * play the song. abstract because each have a different api
     */
    public abstract void playSong();

    public Source getSource(){
        return source;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
