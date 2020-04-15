package structural.bridge.abstraction;

import structural.bridge.implementor.Workshop;

public class Bus extends Vehicle {


    public Bus(Workshop produceWorkshop, Workshop assembleWorkshop) {
        super(produceWorkshop, assembleWorkshop);
    }

    @Override
    public void manufacture() {
        System.out.println(" Bus work is started   ..");
        produceWorkshop.work();
        assembleWorkshop.work();
    }
}
