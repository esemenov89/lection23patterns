package chain;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class Rumor {

    private String message;
    private Rumor rumor;

    public void setRumor(Rumor rumor) {
        this.rumor = rumor;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public void obs(){
        System.out.println(message);
        if(rumor!=null) {
            rumor.obs();
            rumor.message=message;

        }
    }
}
