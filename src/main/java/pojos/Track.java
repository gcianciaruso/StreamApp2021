package pojos;

public abstract class Track {

    protected Artist artist;
    protected String name;
    protected Source source;

    public Track(String name){
        this.name=name;
    }

    public Track(String name, Artist artist){
        this(name);
        this.artist=artist;
    }

    public Track(String name, Artist artist, Source source){
        this(name, artist);
        this.source=source;
    }

    public Source getSource(){
        return source;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(Source source){
        this.source=source;
    }

    public abstract void skipForward();

    public abstract void skipBackward();
}
