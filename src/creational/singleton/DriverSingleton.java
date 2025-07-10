package creational.singleton;

public class DriverSingleton {

    public static void main(String[] args) throws Exception {
        SingletonClass singletonClass = SingletonClass.getSingletonObject();
        SingletonClass singletonClass1 = SingletonClass.getSingletonObject(); //  same object
    }
}
