package state;

/**
 * Created by admin on 05.05.2017.
 */
public class Document {
    private State state;
    private boolean sending = false;
    private boolean isSignedFirst = false;

    //private List<String> playlist = new ArrayList<>();
    //private int currentTrack = 0;

    public Document() {
        this.state = new ReadyState(this);

    }

    public void changeState(State state) {
        if(state instanceof SignedFirstState) {
            if(isSending()) {
                System.out.println("Change state is lock");
                return;
            }
        }
        else{
            this.state = state;
            return;
        }
    }

    public State getState() {
        return state;
    }

    public void setSendingState(boolean sending) {
        this.sending = sending;
    }

    public boolean isSending() {
        return sending;
    }
    public void setIsSignedFirst(boolean signed) {
        isSignedFirst = signed;
    }
}