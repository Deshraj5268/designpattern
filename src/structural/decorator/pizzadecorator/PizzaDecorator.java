package structural.decorator.pizzadecorator;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String name() {
        return this.pizza.name();
    }

    @Override
    public int cost() {
        return this.pizza.cost();
    }
}
