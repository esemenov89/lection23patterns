package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 03.05.2017.
 */
public class MainPrototype {
    public static void main(String[] args) {
/*        List<Copyable> subvisions = new ArrayList<Copyable>();
        List<Copyable> subvisionsCopy = new ArrayList<Copyable>();*/

        Subdivision subvision = new Subdivision();
        subvision.unit=20;

        Troop troop = new Troop();
        troop.subvisions=10;

        System.out.println(subvision.unit*troop.subvisions);

        //subvisions.add(subvision);

    }
}
