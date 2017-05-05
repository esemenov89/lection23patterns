package observer;

/**
 * Created by admin on 04.05.2017.
 */
public interface Observable {
    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyAllObservers();
}
