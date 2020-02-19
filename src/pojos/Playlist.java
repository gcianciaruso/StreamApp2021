package pojos;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> playlist;
    private String name;

    public Playlist(){
        playlist=new ArrayList<Song>();
    }

    public Playlist(String name){
        super();
        this.name=name;
    }


}
