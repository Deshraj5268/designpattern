package creational.factorymethod.elctricitybill;

public class CommercialPlan extends Plan{
    @Override
    protected void getRate() {
        rate =  PlanConstants.COMMERCIAL_RATE;
    }
}
