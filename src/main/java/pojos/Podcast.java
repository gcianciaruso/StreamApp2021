package pojos;

public class Podcast extends Track{

    public Podcast(String name){
        super(name);
    }
    
    public Podcast(String name, Artist artist){super(name, artist);}

    public Podcast(String name, Artist artist, Source source){super(name, artist, source);}


    /**
     * skip forward 15 seconds
     */
    @Override
    public void skipForward() {
        //TODO: implement method
        //need to be able to skip times for this
    }

    /**
     * skip backward 15 seconds
     */
    @Override
    public void skipBackward() {
        //TODO: implement method
        //need to be able to skip times for this
    }


}
