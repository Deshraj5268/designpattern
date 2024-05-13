package structural.facade.restaurantOrderSystem;

public class FoodOrderSystem {

    private WaiterSubsSystem waiterSubsSystem;
    private KitchenSubsystem kitchenSubsystem;

    public FoodOrderSystem(){
        this.waiterSubsSystem = new WaiterSubsSystem();
        this.kitchenSubsystem = new KitchenSubsystem();
    }

    public void orderFood(){
        waiterSubsSystem.takOrder();
        waiterSubsSystem.sendToKitchen();
        kitchenSubsystem.prepareFood();
        kitchenSubsystem.callWaiter();
        waiterSubsSystem.servingCustomer();
        kitchenSubsystem.washDishes();
    }
}
