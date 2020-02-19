package pojos;

public class SpotifySong extends Song {


    public SpotifySong(String name, Artist artist) {
        super(name, artist);
    }

    public SpotifySong(String name, Artist artist, Source source) {
        super(name, artist, source);
    }

    @Override
    /**
     * This method plays the song by going to the api and doing shit.
     * not sure exactly what though
     */
    public void playSong() {
        //TODO: implement method
    }
}
