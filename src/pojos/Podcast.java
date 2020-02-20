package pojos;

public class Podcast extends Track{

    private String name;

    public Podcast(String name){
        super(name);
    }

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
