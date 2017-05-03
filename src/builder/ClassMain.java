package builder;

import builder.galustyan.DjamshutBuilder;
import builder.svetlakov.Boss;

/**
 * Created by admin on 03.05.2017.
 */
public class ClassMain {
    public static void main(String[] args) {

        DjamshutBuilder builderDJ = new DjamshutBuilder();

        Boss boss = new Boss(builderDJ);
        boss.build();
    }
}
