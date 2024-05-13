package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;

public class FailedState implements OrderState{

    @Override
    public OrderStage getOrderStage() {
        return OrderStage.FAILED_STAGE;
    }

    @Override
    public void executeState(OrderContext orderContext) {
        System.out.println("failed state ..");
        orderContext.setCurrentOrderState(null);
    }
}
