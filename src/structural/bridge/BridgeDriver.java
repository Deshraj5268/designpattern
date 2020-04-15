package structural.bridge;

import structural.bridge.abstraction.Bus;
import structural.bridge.abstraction.Truck;
import structural.bridge.abstraction.Vehicle;
import structural.bridge.implementor.Assemble;
import structural.bridge.implementor.Produce;

public class BridgeDriver {

    public static void main(String[] args) {

        Vehicle busVehicle = new Bus(new Produce(),new Assemble());
        busVehicle.manufacture();

        Vehicle truckVehicle = new Truck(new Produce(),new Assemble());
        truckVehicle.manufacture();
    }
}
