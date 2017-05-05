package decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class SMSTariff extends TariffDecorator {

    public SMSTariff(CountTariffInterface countTariffInterface) {
        super(countTariffInterface);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 100 SMS");
        super.processTariff();
    }
}
