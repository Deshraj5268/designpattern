package creational.abstractfactory;

public class SmallerCar extends Car {

    public SmallerCar(Location location){
        super(CarType.SMALL,location);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("small Car constructed for location "+getLocation());
    }
}
