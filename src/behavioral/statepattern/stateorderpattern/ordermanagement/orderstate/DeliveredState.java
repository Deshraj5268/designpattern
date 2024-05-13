package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.Action;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.CreateStateAction;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.DeliveredStateAction;

public class DeliveredState implements OrderState{


    Action deliveredStateAction;
    public DeliveredState(){
        this.deliveredStateAction = new DeliveredStateAction();
    }

    @Override
    public OrderStage getOrderStage() {
        return OrderStage.DELIVERED_STAGE;
    }

    @Override
    public void executeState(OrderContext orderContext) {
        try{
            System.out.println("in DeliveredState ");
            deliveredStateAction.performAction(orderContext);
        }catch (Exception ex){
            System.out.println("exception in DeliveredState order");
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(OrderStage.FAILED_STAGE));
        }
    }
}
