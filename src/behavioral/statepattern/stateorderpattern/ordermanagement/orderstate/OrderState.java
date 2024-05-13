package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;

public interface OrderState {

    OrderStage getOrderStage();

    void executeState(OrderContext orderContext);
}
