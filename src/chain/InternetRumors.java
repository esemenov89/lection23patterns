package chain;

/**
 * Created by admin on 05.05.2017.
 */
public class InternetRumors extends Rumor {

    private boolean isConnect=true;

    public void setConnect(boolean connect) {
        isConnect = connect;
    }

    @Override
    public void obs() {
        if(!isConnect){
            System.out.println("Sorry, connect is fail.");
            return;
        }
        System.out.println("Internet said");
        super.obs();
    }
}
