package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class FamilyHoliday implements HolidaysStrategy {

    @Override
    public void celebrate() {
        System.out.println("It's a family supper");
    }
}
