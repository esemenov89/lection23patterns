package prototype;

import java.util.ArrayList;

/**
 * Created by admin on 03.05.2017.
 */
public class Subdivision extends Copyable{


    public Subdivision(){

    }

    public Subdivision(Subdivision s) {
        super(s);
    }

    @Override
    public Subdivision copy() {
        return new Subdivision(this);
    }
}
