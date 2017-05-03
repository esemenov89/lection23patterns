package builder.galustyan;

import builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class DjamshutBuilder implements HouseBuilder {

    private String basement;
    private String walls;
    private String roof;


    @Override
    public void fillBasement() {
        basement = "dj:basement complete";
    }

    @Override
    public void createWalls() {
        walls = "dj:walls complete";
    }

    @Override
    public void createRoof() {
        roof = "dj:roof complete";
    }

    @Override
    public String getResult(){
        return basement+" "+walls+" "+roof;
    }
}
