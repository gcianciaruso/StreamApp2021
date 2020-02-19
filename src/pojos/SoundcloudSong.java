package pojos;

public class SoundcloudSong extends Song {


    public SoundcloudSong(String name, Artist artist) {
        super(name, artist);
    }

    public SoundcloudSong(String name, Artist artist, Source source) {
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
