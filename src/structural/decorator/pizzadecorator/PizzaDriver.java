package structural.decorator.pizzadecorator;

import structural.decorator.pizzadecorator.topping.Capsicum;
import structural.decorator.pizzadecorator.topping.Cheese;

public class PizzaDriver {

    public static void main(String[] args) {

        System.out.println("Do you want to eat pizza ....");

        Pizza pizza = new BasicPizza();
        System.out.println("Pizza name :"+pizza.name() + " and it's cost is :  "+pizza.cost());

        Pizza countryHousePizza = new PizzaDecorator(new CountryHousePizza());
        System.out.println("Pizza name :"+countryHousePizza.name() + " and it's cost is :  "+countryHousePizza.cost());

        System.out.print("with topping");
        countryHousePizza = new Capsicum(countryHousePizza);
        countryHousePizza = new Cheese(countryHousePizza);
        System.out.print(" cost is "+countryHousePizza.cost());

    }
}
