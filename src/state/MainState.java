package state;

/**
 * Created by admin on 05.05.2017.
 */
public class MainState {

    public static void main(String[] args) {
        Document document = new Document();
        State sendingState = new SendingState(document);
        document.changeState(sendingState);

        System.out.println(document.getState());

        State signedFirstState = new SignedFirstState(document);
        document.changeState(signedFirstState);

        System.out.println(document.getState());
    }
}
