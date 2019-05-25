package creational.abstractfactory;

import constants.AbstractFactoryConstants;
import exception.ApplicationException;

public class USACarFactory {

    private USACarFactory(){

    }

    public static Car buildCar(CarType model) throws ApplicationException {

        Car car = null;

        switch (model){

            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;

            case SMALL:
                car = new SmallerCar(Location.USA);
                break;

            default:
                throw new ApplicationException(AbstractFactoryConstants.MODEL_DOES_NOT_EXISTS);
        }
        return car;
    }
}
