package creational.factorymethod.elctricitybill;

public class DomesticPlan extends Plan{
    @Override
    protected void getRate() {
         rate = PlanConstants.DOMESTIC_RATE;

    }
}
