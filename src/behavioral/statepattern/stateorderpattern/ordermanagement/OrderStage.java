package behavioral.statepattern.stateorderpattern.ordermanagement;

public enum OrderStage {

    CREATE_STAGE,
    PAYMENT_STAGE,
    SHIPMENT_STAGE,
    FULFILLMENT_STAGE,
    DELIVERED_STAGE,
    FAILED_STAGE
    ;


    public static boolean isOrderStageExist(OrderStage orderStage){
        for (OrderStage existingOrderstage : OrderStage.values()){
            if(existingOrderstage == orderStage){
                return true;
            }
        }
        return false;
    }
}
