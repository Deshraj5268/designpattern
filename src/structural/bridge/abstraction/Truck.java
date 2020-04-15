package structural.bridge.abstraction;

import structural.bridge.implementor.Workshop;

public class Truck extends Vehicle {

    public Truck(Workshop produceWorkshop, Workshop assembleWorkshop) {
        super(produceWorkshop, assembleWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println(" truck work is started  ..");
        produceWorkshop.work();
        assembleWorkshop.work();
    }
}
