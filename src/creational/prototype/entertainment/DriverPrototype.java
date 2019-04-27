package creational.prototype.entertainment;

public class DriverPrototype {

    public static void main(String[] args) {

        try{
            String prototypeMovie = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(prototypeMovie);
        }catch (CloneNotSupportedException ex){
            System.out.println(ex);
        }
    }
}
