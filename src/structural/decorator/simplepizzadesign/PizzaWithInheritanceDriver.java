package structural.decorator.simplepizzadesign;

public class PizzaWithInheritanceDriver {

    public static void main(String[] args) {

        SimplePizza simplePizza = new CountryHousePizza(20);

        simplePizza.setCapsicumTopping(true);
        simplePizza.setPaneerTopping(true);
        System.out.println(simplePizza.getName() + " cost is : "+simplePizza.getCost());

    }
}
