package state;

import javafx.print.PageLayout;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class State {

    public Document document;

    public State(){

    }

    public State(Document document) {
        this.document = document;
    }

    public abstract String sendingState(); //1
    public abstract String newerState();//2
    public abstract String signedFirstState(); //3
    public abstract String errorSignState();//4
    public abstract String registeredState(); //5
    public abstract String errorValidateState();//6
    public abstract String sentState(); //7
    public abstract String deliveredState(); //8
    public abstract String errorSendingState(); //9
    public abstract String signedSecondState(); //10
    public abstract String ticketSentState(); //11
    public abstract String ticketReceivedState(); //12
    public abstract String canceledStates(); //13

}
