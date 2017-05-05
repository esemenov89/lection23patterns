package decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class MainDecorator {
    public static void main(String[] args) {
        MainTariff mainTariff = new MainTariff();
        SMSTariff smsTariff = new SMSTariff(mainTariff);
        //RoamingTariff roamingTariff = new RoamingTariff(smsTariff);
        InternetTariff internetTariff = new InternetTariff(smsTariff);

        internetTariff.processTariff();

    }
}
