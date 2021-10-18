package decorator;

import java.util.HashMap;

/**
 * Added functionality for specifying different sizes.
 * In this case, the size-options are the same for all possible toppings,
 * but each topping will have to specify the costs for different sizes, as these can be different.
 *
 * As can be seen, it gets quite complicated quite fast... Adding a new size-option for all toppings would need
 * changes in all Topping-classes, so another design pattern would be better for extendability...
 * (Maybe Composite pattern instead?)
 *
 * "In practice, nobody in their right mind would go to the trouble of using Decorator to add up costs like this,
 * and there are much easier approaches. Decorator is better used in more complex situations,
 * like processing documents or building complex user interfaces, by layering functionality."
 *  -> https://softwareengineering.stackexchange.com/questions/377144/what-pattern-can-be-used-instead-of-these-if-statements-in-starbuzz-head-first
 */
public class TomatoSauce extends ToppingDecorator {

    private ToppingSize size = ToppingSize.MEDIUM;
    private final HashMap<ToppingSize, Double> sizeCost = new HashMap<>();

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        initSize();
        System.out.println("Adding Tomato Sauce");
    }

    public TomatoSauce(ToppingSize size, Pizza newPizza) {
        super(newPizza);
        this.size = size;
        initSize();
        System.out.println("Adding Tomato Sauce (" + size + ")");
    }

    private void initSize() {
        sizeCost.put(ToppingSize.SMALL, 0.30);
        sizeCost.put(ToppingSize.MEDIUM, 0.35);
        sizeCost.put(ToppingSize.LARGE, 0.40);
    }


    public String getDescription() {
        if (size == ToppingSize.MEDIUM) {
            return tempPizza.getDescription() + ", Tomato Sauce";
        }
        return tempPizza.getDescription() + ", Tomato Sauce (" + size + ")";
    }

    public double getCost() {
        return tempPizza.getCost() + sizeCost.get(size);
    }
}
