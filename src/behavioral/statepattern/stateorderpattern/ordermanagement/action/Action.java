package behavioral.statepattern.stateorderpattern.ordermanagement.action;

import behavioral.statepattern.stateorderpattern.ordermanagement.OrderContext;

public interface Action {

    public void performAction(OrderContext orderContext);
}
