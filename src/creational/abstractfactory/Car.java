package creational.abstractfactory;

public abstract class Car {

    private CarType model;
    private Location location;

    public Car(CarType model,Location location){
        this.model = model;
        this.location = location;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public abstract void construct();

    @Override
    public String toString(){
        return "Model-"+model+", Location-"+location;
    }

}
