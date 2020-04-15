package structural.decorator.pizzadecorator.topping;

import structural.decorator.pizzadecorator.Pizza;
import structural.decorator.pizzadecorator.PizzaDecorator;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public int cost() {
        return 30 + super.cost();
    }
}
