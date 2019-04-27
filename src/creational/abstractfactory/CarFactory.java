package creational.abstractfactory;

import constants.AbstractFactoryConstants;
import exception.AbstractFactoryException;

public class CarFactory {

    private CarFactory(){

    }

    public static Car carFactory(CarType model) throws AbstractFactoryException{

        Car car = null;
        Location location = Location.USA;
        switch (location){
            case USA:
                car = USACarFactory.buildCar(model);
                break;

            case AISA:
                car = AsiaCarFactory.buildCar(model);
                break;

            default:
                throw new AbstractFactoryException(AbstractFactoryConstants.MODEL_DOES_NOT_EXISTS);

        }
        return car;
    }
}
