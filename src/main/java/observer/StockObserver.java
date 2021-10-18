package observer;

public class StockObserver implements Observer {
    private double AMZN;
    private double TSLA;

    private static int observerIDTracker = 1;
    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = observerIDTracker++;

        System.out.println("New Observer: " + observerID + "\n");
        stockGrabber.register(this);
    }

    @Override
    public void update(double AMZN, double TSLA) {
        this.AMZN = AMZN;
        this.TSLA = TSLA;

        System.out.println(observerID + "\nAmazon: " + AMZN + "\nTesla: " + TSLA + "\n");
    }
}
