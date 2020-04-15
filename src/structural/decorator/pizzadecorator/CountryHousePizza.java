package structural.decorator.pizzadecorator;

public class CountryHousePizza implements Pizza {

    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String name() {
        return "CountryHousePizza";
    }
}
