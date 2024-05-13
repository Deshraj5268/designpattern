package behavioral.statepattern.stateorderpattern.ordermanagement;

public class Transition {

    public void findNextState(OrderContext orderContext){
        if(OrderStage.CREATE_STAGE.equals(orderContext.getCurrentOrderStage())){
            orderContext.setCurrentOrderStage(OrderStage.PAYMENT_STAGE);
        }else if(OrderStage.PAYMENT_STAGE.equals(orderContext.getCurrentOrderStage())){
            orderContext.setCurrentOrderStage(OrderStage.SHIPMENT_STAGE);
        }else if(OrderStage.SHIPMENT_STAGE.equals(orderContext.getCurrentOrderStage())){
            orderContext.setCurrentOrderStage(OrderStage.FULFILLMENT_STAGE);
        }else if(OrderStage.FULFILLMENT_STAGE.equals(orderContext.getCurrentOrderStage())){
            orderContext.setCurrentOrderStage(OrderStage.DELIVERED_STAGE);
        }else {
            orderContext.setCurrentOrderStage(OrderStage.FAILED_STAGE);
        }

    }

}
