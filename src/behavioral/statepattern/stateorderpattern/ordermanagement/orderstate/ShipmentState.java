package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.Action;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.ShipmentStateAction;

public class ShipmentState implements OrderState {


    Action ShipmentStateAction;
    public ShipmentState(){
        this.ShipmentStateAction = new ShipmentStateAction();
    }

    @Override
    public OrderStage getOrderStage() {
        return OrderStage.SHIPMENT_STAGE;
    }

    @Override
    public void executeState(OrderContext orderContext) {
        try{
            System.out.println("in ShipmentState ");
            ShipmentStateAction.performAction(orderContext);
        }catch (Exception ex){
            System.out.println("exception in ShipmentState order");
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(OrderStage.FAILED_STAGE));
        }
    }
}
