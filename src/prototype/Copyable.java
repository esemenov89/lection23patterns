package prototype;

/**
 * Created by admin on 03.05.2017.
 */
public abstract class Copyable {

    public int unit;
    public abstract Copyable copy();

    Copyable(){

    }

    public Copyable(Copyable c){
        if (c != null) {
            this.unit = c.unit;
        }
    }
}
