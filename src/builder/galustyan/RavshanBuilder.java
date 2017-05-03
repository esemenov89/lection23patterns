package builder.galustyan;

import builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class RavshanBuilder implements HouseBuilder {

    private String basement;
    private String walls;
    private String roof;


    @Override
    public void fillBasement() {
        basement = "rav:basement complete";
    }

    @Override
    public void createWalls() {
        walls = "rav:walls complete";
    }

    @Override
    public void createRoof() {
        roof = "rav:roof complete";
    }

    public String getResult(){
        return basement+" "+walls+" "+roof;
    }
}