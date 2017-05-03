package builder.svetlakov;

import builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class Boss  {
    private HouseBuilder houseBuilder;

    public Boss(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void build(){
        houseBuilder.fillBasement();
        houseBuilder.createWalls();
        houseBuilder.createRoof();
        System.out.println(houseBuilder.getResult());
    }
}
