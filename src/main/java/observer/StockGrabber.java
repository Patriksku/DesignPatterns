package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    ArrayList<Observer> listOfObservers = new ArrayList<>();
    private double AMZN;
    private double TSLA;

    @Override
    public void register(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println((listOfObservers.indexOf(observer) + 1) + "deleted.");
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : listOfObservers) {
            observer.update(AMZN, TSLA);
        }
    }

    public void setAMZNPrice(double amzn) {
        AMZN = amzn;
        notifyObserver();
    }

    public void setTSLAPrice(double tsla) {
        TSLA = tsla;
        notifyObserver();
    }
}
