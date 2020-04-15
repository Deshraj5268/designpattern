package structural.bridge.abstraction;

import structural.bridge.implementor.Workshop;

public abstract class Vehicle {

    public Workshop produceWorkshop;
    public Workshop assembleWorkshop;

    public Vehicle(Workshop produceWorkshop, Workshop assembleWorkshop) {
        this.produceWorkshop = produceWorkshop;
        this.assembleWorkshop = assembleWorkshop;
    }

    public abstract void manufacture();
}
