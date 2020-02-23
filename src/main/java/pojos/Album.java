package pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Album {

    private List<Song> songs;
    private Map<String, Integer> cache;
    private String name;
    private Artist artist;

    public Album(String name){
        this.name=name;
        songs=new ArrayList<Song>();
        cache=new HashMap<String, Integer>();
    }

    public Album(String name, Artist artist){
        this(name);
        this.artist=artist;
    }

    public void addSong(Song song){
        if(cache.containsKey(song.getName())){
            cache.put(song.getName(), 1);
        }
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
