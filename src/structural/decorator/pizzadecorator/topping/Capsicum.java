package structural.decorator.pizzadecorator.topping;

import structural.decorator.pizzadecorator.Pizza;
import structural.decorator.pizzadecorator.PizzaDecorator;

public class Capsicum extends PizzaDecorator {

    public Capsicum(Pizza pizza) {
        super(pizza);
    }

    public int cost() {
        return 25 + super.cost();
    }
}
