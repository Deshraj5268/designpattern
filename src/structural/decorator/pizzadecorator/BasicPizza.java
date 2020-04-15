package structural.decorator.pizzadecorator;

public class BasicPizza implements Pizza{

    @Override
    public int cost() {
        return 80;
    }

    @Override
    public String name() {
        return "BasicPizza";
    }
}
