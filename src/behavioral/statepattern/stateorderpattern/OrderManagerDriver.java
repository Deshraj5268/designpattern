package behavioral.statepattern.stateorderpattern;

import behavioral.statepattern.stateorderpattern.ordermanagement.ContextInitializer;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;
import behavioral.statepattern.stateorderpattern.ordermanagement.Transition;
import behavioral.statepattern.stateorderpattern.ordermanagement.orderstate.OrderStateFactory;

public class OrderManagerDriver {

    public static void main(String[] args) {
        ContextInitializer contextInitializer = new ContextInitializer();
        OrderContext orderContext = contextInitializer.initialize(OrderStage.CREATE_STAGE);
        Transition transition = new Transition();
        while (isTerminal(orderContext)){
            orderContext.getCurrentOrderState().executeState(orderContext);
            transition.findNextState(orderContext);
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(orderContext.getCurrentOrderStage()));
        }
    }

    public static boolean isTerminal(OrderContext orderContext){
       return orderContext.getCurrentOrderState() != null &&
                !orderContext.getCurrentOrderStage().equals(OrderStage.DELIVERED_STAGE)
                && !orderContext.getCurrentOrderStage().equals(OrderStage.FAILED_STAGE);
    }
}
