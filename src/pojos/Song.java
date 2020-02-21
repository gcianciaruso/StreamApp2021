package pojos;

public abstract class Song extends Track{

    public Song(String name, Artist artist){
        super(name, artist);
    }

    public Song(String name, Artist artist, Source source){
        super(name, artist, source);
    }

    /**
     * play the song. abstract because each have a different api
     */
    public abstract void playSong();

}
