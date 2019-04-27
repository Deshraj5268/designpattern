package creational.abstractfactory;

import constants.AbstractFactoryConstants;
import exception.AbstractFactoryException;

public class AsiaCarFactory {

    private AsiaCarFactory(){

    }

    public static Car buildCar(CarType model) throws AbstractFactoryException{

        Car car = null;

        switch (model){
            case SMALL:
                car = new SmallerCar(Location.AISA);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.AISA);
                break;

            default:
                throw new AbstractFactoryException(AbstractFactoryConstants.MODEL_DOES_NOT_EXISTS);
        }
        return car;
    }
}
