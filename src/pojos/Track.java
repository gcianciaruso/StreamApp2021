package pojos;

public abstract class Track {

    protected Artist artist;
    protected String name;
    protected Source source;

    public Track(String name){
        this.name=name;
    }

    public Track(String name, Artist artist){
        this.name=name;
        this.artist=artist;
    }

    public Track(String name, Artist artist, Source source){
        this.name=name;
        this.artist=artist;
        this.source=source;
    }


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

    public abstract void skipForward();

    public abstract void skipBackward();
}
