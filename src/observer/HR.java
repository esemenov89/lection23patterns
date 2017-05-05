package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class HR implements Observable {

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer obs:observerList){
            obs.message("We have new job.");
        }
    }
}
