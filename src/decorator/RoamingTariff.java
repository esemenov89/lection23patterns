package decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class RoamingTariff extends TariffDecorator {

    public RoamingTariff(CountTariffInterface countTariffInterface) {
        super(countTariffInterface);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 10 days in roaming");
        super.processTariff();
    }
}
