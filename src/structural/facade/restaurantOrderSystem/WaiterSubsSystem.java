package structural.facade.restaurantOrderSystem;

public class WaiterSubsSystem {

    public void takOrder(){
        System.out.println("waiter taking order from client");
    }

    public void sendToKitchen(){
        System.out.println("waiter send order to kitchen ");
    }

    public void servingCustomer(){
        System.out.println("serving customer");
    }
}
