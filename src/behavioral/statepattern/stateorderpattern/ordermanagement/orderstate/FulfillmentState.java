package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.Action;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.CreateStateAction;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.FulfillmentStateAction;

public class FulfillmentState implements OrderState{


    Action fulfillmentStateAction;
    public FulfillmentState(){
        this.fulfillmentStateAction = new FulfillmentStateAction();
    }

    @Override
    public OrderStage getOrderStage() {
        return OrderStage.FULFILLMENT_STAGE;
    }

    @Override
    public void executeState(OrderContext orderContext) {
        try{
            System.out.println("in FulfillmentState ");
            fulfillmentStateAction.performAction(orderContext);
        }catch (Exception ex){
            System.out.println("exception in FulfillmentState order");
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(OrderStage.FAILED_STAGE));
        }
    }
}
