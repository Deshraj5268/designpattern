package creational.factorymethod.elctricitybill;

public class PlanFactory {

    private PlanFactory(){

    }

    public static Plan getPlan(String planType){
        Plan plan;
        if(PlanConstants.COMMERCIAL.equalsIgnoreCase(planType)){
            plan = new CommercialPlan();
        }else if(PlanConstants.INSTITUTIONAL.equalsIgnoreCase(planType)){
            plan = new InstitutionalPlan();
        }else {
            plan = new DomesticPlan();
        }
        return plan;
    }
}
