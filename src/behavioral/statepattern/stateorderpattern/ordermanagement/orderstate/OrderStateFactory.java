package behavioral.statepattern.stateorderpattern.ordermanagement.orderstate;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderStage;

import java.util.HashMap;
import java.util.Map;

public class OrderStateFactory {

    static Map<OrderStage,OrderState> orderStageAndStateMap = new HashMap<>();
    public static OrderState getOrderStageByStage(OrderStage orderStage){
        OrderState orderState = orderStageAndStateMap.get(orderStage);
        if(orderState != null){
            return orderState;
        }else {
            switch (orderStage) {
                case CREATE_STAGE:
                    orderState = new CreatedState();
                    orderStageAndStateMap.put(OrderStage.CREATE_STAGE, orderState);
                    break;
                case PAYMENT_STAGE:
                    orderState = new PaymentState();
                    orderStageAndStateMap.put(OrderStage.PAYMENT_STAGE, orderState);
                    break;
                case SHIPMENT_STAGE:
                    orderState = new ShipmentState();
                    orderStageAndStateMap.put(OrderStage.SHIPMENT_STAGE,orderState);
                    break;
                case FULFILLMENT_STAGE:
                    orderState = new FulfillmentState();
                    orderStageAndStateMap.put(OrderStage.FULFILLMENT_STAGE,orderState);
                    break;
                case DELIVERED_STAGE:
                    orderState = new DeliveredState();
                    orderStageAndStateMap.put(OrderStage.DELIVERED_STAGE,orderState);
                    break;
                case FAILED_STAGE:
                    orderState = new FailedState();
                    orderStageAndStateMap.put(OrderStage.FAILED_STAGE,orderState);
                    break;
                default:
                    throw new RuntimeException("no state present for given stage");
            }
            return orderState;
        }
    }

}
