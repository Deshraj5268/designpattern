package structural.decorator.simplepizzadesign;

public class FarmHousePizza extends SimplePizza {

    private int farmHouseCost;

    public FarmHousePizza(int farmHouseCost) {
        this.farmHouseCost = farmHouseCost;
    }

    @Override
    public String getName() {
        return "FarmHousePizza";
    }

    @Override
    public int getCost() {
        return super.getCost() + farmHouseCost;
    }
}
