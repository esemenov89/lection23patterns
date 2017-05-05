package decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class InternetTariff extends TariffDecorator {

    public InternetTariff(CountTariffInterface countTariffInterface) {
        super(countTariffInterface);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 3.5 GB internet");
        super.processTariff();
    }
}
