package structural.decorator.simplepizzadesign;

public class CountryHousePizza extends SimplePizza {

    private int countryHouseCost;

    @Override
    public int getCost() {
        return super.getCost() + countryHouseCost;
    }

    @Override
    public String getName() {
        return "CountryHousePizza";
    }

    public CountryHousePizza(int countryHouseCost) {
        this.countryHouseCost = countryHouseCost;
    }
}
