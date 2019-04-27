package creational.abstractfactory;

import exception.AbstractFactoryException;

public class DriverAbstractFactory {

    public static void main(String[] args) {
        try {
            CarFactory.carFactory(CarType.SMALL);
        }catch (AbstractFactoryException ex){
            System.out.println(ex);
        }

    }
}
