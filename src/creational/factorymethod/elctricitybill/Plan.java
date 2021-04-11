package creational.factorymethod.elctricitybill;

public abstract class Plan {

    protected double rate;

    protected abstract void getRate();

    protected double calculateBill(int units){
        return units*rate;
    }

}
