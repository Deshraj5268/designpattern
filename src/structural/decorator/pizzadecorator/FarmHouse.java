package structural.decorator.pizzadecorator;

public class FarmHouse implements Pizza{

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String name() {
        return "FarmHouse";
    }
}
