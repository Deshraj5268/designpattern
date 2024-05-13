package behavioral.statepattern.stateorderpattern.ordermanagement;

import behavioral.statepattern.stateorderpattern.ordermanagement.orderstate.OrderState;

public class OrderContext {

    OrderState currentOrderState;

    OrderStage currentOrderStage;

    public OrderState getCurrentOrderState() {
        return currentOrderState;
    }

    public void setCurrentOrderState(OrderState currentOrderState) {
        this.currentOrderState = currentOrderState;
    }

    public OrderStage getCurrentOrderStage() {
        return currentOrderStage;
    }

    public void setCurrentOrderStage(OrderStage currentOrderStage) {
        this.currentOrderStage = currentOrderStage;
    }
}
