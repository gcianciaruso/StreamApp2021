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
        //need to use api for this
    }

    /**
     * skip forward to next song (or to specified time?)
     */
    @Override
    public void skipForward() {
        //TODO: implement method
        //might need to be able to skip times for this if its jumping to time
    }

    /**
     * skip backward to previous song (or to specified time?)
     */
    @Override
    public void skipBackward() {
        //TODO: implement method
        //might need to be able to skip times for this if its jumping to time
    }
}
