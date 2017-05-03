package prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class Troop extends Copyable{

    int subvisions;
    public Troop(){

    }

    public Troop(Troop s) {
        super(s);
        this.subvisions=s.subvisions;
    }


    @Override
    public Copyable copy() {
        return null;
    }
}
