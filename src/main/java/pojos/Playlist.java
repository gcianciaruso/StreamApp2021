package pojos;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs;
    private String name;

    public Playlist(){
        songs=new ArrayList<Song>();
    }

    public Playlist(String name){
        this();
        this.name=name;
    }

    /**
     * add a song to the playlist
     * maybe if song is already there, tell user and confirm?
     * @param song
     */
    public void addSong(Song song){
        songs.add(song);
    }

    public List<Song> getList() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
