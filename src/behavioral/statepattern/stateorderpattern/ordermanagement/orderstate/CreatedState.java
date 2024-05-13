package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;
import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.Action;
import behavioral.statepattern.stateorderpattern.ordermanagement.action.CreateStateAction;

public class CreatedState implements OrderState{

    Action createStateAction;
    public CreatedState(){
       this.createStateAction = new CreateStateAction();
    }

    @Override
    public OrderStage getOrderStage() {
        return OrderStage.CREATE_STAGE;
    }

    @Override
    public void executeState(OrderContext orderContext) {
        try{
            System.out.println("in createState ");
            createStateAction.performAction(orderContext);
        }catch (Exception ex){
            System.out.println("exception in CreatedState order");
            orderContext.setCurrentOrderState(OrderStateFactory.getOrderStageByStage(OrderStage.FAILED_STAGE));
        }
    }
}
