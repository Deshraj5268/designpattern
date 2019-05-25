package structural.classdata;

public class DataClassDriverPattern {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("circumference : "+circle.circumFerence());
        System.out.println("diameter : "+circle.diameter());
    }
}
