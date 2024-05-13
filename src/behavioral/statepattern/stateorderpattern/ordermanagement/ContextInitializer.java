package behavioral.statepattern.stateorderpattern.ordermanagement;

import behavioral.statepattern.stateorderpattern.ordermanagement.orderstate.OrderStateFactory;

public class ContextInitializer {

    public OrderContext initialize(OrderStage orderStage){
        OrderContext orderContext = new OrderContext();
        if(OrderStage.isOrderStageExist(orderStage)) {
            orderContext.setCurrentOrderStage(orderStage);
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(orderStage));
        }else {
            orderContext.setCurrentOrderStage(OrderStage.CREATE_STAGE);
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(OrderStage.CREATE_STAGE));
        }
        return orderContext;
    }
}
