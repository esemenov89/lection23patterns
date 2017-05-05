package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class MainChain {

    public static void main(String[] args) {
        BabkiRumors babkiRumors = new BabkiRumors();
        babkiRumors.setMessage("Strings are very populary in Innopolis");

        babkiRumors.setLive(false);

        NewsPaperRumors newsPaperRumors = new NewsPaperRumors();
        newsPaperRumors.setBalance(11000L);
        InternetRumors internetRumors = new InternetRumors();

        internetRumors.setConnect(false);

        babkiRumors.setRumor(newsPaperRumors);
        newsPaperRumors.setRumor(internetRumors);
        babkiRumors.obs();
    }
}
