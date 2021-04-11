package creational.factorymethod.elctricitybill;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Plan commercialPlan = PlanFactory.getPlan(PlanConstants.COMMERCIAL);

        commercialPlan.getRate();
        double commercialBillAmount = commercialPlan.calculateBill(10);
        System.out.println(commercialBillAmount);
    }
}
