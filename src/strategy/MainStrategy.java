package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class MainStrategy {

    public static void main(String[] args) {
        Context context = new Context();
        context.setHasFamily(false);
        context.setHasFriends(false);
        context.setCash(10000);
        context.celebrate();


    }
}
