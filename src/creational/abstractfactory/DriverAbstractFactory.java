package creational.abstractfactory;

import exception.ApplicationException;

public class DriverAbstractFactory {

    public static void main(String[] args) {
        try {
            CarFactory.carFactory(CarType.SMALL);
        }catch (ApplicationException ex){
            System.out.println(ex);
        }

    }
}
