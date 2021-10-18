package observer;

public class Main {

    public static void main(String[] args) {
        StockGrabber grabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(grabber);

        grabber.setAMZNPrice(245.76);
        grabber.setTSLAPrice(170.31);

        StockObserver observer2 = new StockObserver(grabber);

        grabber.setAMZNPrice(240.31);
        grabber.setTSLAPrice(110.22);
    }
}
