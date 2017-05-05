package state;

/**
 * Created by admin on 05.05.2017.
 */
public class ReadyState extends State {

    public ReadyState(Document document) {
        super(document);
    }

    @Override
    public String sendingState() {
        document.changeState(new SendingState(document));
        return "Locked...";
    }

    @Override
    public String newerState() {
        return null;
    }

    @Override
    public String signedFirstState() {
        return null;
    }

    @Override
    public String errorSignState() {
        return null;
    }

    @Override
    public String registeredState() {
        return null;
    }

    @Override
    public String errorValidateState() {
        return null;
    }

    @Override
    public String sentState() {
        return null;
    }

    @Override
    public String deliveredState() {
        return null;
    }

    @Override
    public String errorSendingState() {
        return null;
    }

    @Override
    public String signedSecondState() {
        return null;
    }

    @Override
    public String ticketSentState() {
        return null;
    }

    @Override
    public String ticketReceivedState() {
        return null;
    }

    @Override
    public String canceledStates() {
        return null;
    }

/*    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }*/
}