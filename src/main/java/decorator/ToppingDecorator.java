package decorator;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    public abstract String getDescription();

    public abstract double getCost();
}
