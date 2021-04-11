package creational.factorymethod.elctricitybill;

public class InstitutionalPlan extends Plan{
    @Override
    protected void getRate() {
        rate =  PlanConstants.INSTITUTIONAL_RATE;
    }
}
