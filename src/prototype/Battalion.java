package prototype;

/**
 * Created by admin on 03.05.2017.
 */
public class Battalion extends Copyable{

    int troops;

    public Battalion(){

    }

    public Battalion(Battalion s) {
        super(s);
        troops = 6;
    }

    @Override
    public Battalion copy() {
        return new Battalion(this);
    }
}
