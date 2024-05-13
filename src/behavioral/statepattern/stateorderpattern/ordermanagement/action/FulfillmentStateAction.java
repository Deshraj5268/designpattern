package behavioral.statepattern.stateorderpattern.ordermanagement.action;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;

public class FulfillmentStateAction implements Action{
    @Override
    public void performAction(OrderContext orderContext) {
        System.out.println("performing action for stage :"+orderContext.getCurrentOrderStage());
    }
}
