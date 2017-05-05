package decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class TariffDecorator implements CountTariffInterface {

    private CountTariffInterface countTariffInterface;

    public TariffDecorator(CountTariffInterface countTariffInterface) {
        this.countTariffInterface = countTariffInterface;
    }

    @Override
    public void processTariff() {
    }
}
