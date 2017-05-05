package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class ForeverAloneHoliday implements  HolidaysStrategy {
    @Override
    public void celebrate() {
        System.out.println("I am autist");
    }
}
