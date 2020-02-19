package pojos;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> list;
    private String name;

    public Playlist(){
        list=new ArrayList<Song>();
    }

    public Playlist(String name){
        super();
        this.name=name;
    }

    /**
     * add a song to the playlist
     * @param song
     */
    public void addSong(Song song){
        list.add(song);
    }

    public List<Song> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
