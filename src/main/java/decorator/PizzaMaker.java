package decorator;

public class PizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Cost: " + basicPizza.getCost());

        System.out.println();

        Pizza pizzaLargeSauce = new TomatoSauce(ToppingSize.LARGE, (new Mozzarella(new PlainPizza())));
        System.out.println("Ingredients: " + pizzaLargeSauce.getDescription());
        System.out.println("Cost: " + pizzaLargeSauce.getCost());
    }
}
