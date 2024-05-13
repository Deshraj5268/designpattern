package structural.facade;

import structural.facade.restaurantOrderSystem.FoodOrderSystem;

public class OrderFacade {

    public static void main(String[] args) {

        /*https://medium.com/@andreaspoyias/design-patterns-a-quick-guide-to-facade-pattern-16e3d2f1bfb6*/
        FoodOrderSystem foodOrderSystem = new FoodOrderSystem();
        foodOrderSystem.orderFood();
    }
}
