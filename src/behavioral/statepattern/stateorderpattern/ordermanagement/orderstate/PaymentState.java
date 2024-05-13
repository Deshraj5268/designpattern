package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.Action;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.PaymentStateAction;

public class PaymentState implements OrderState{


    Action paymentStateAction;
    public PaymentState(){
        this.paymentStateAction = new PaymentStateAction();
    }

    @Override
    public OrderStage getOrderStage() {
        return OrderStage.PAYMENT_STAGE;
    }

    @Override
    public void executeState(OrderContext orderContext) {
        try{
            System.out.println("in PaymentState ");
            paymentStateAction.performAction(orderContext);
        }catch (Exception ex){
            System.out.println("exception in PaymentState order");
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(OrderStage.FAILED_STAGE));
        }
    }
}
