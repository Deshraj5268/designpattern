package structural.decorator.phonedecorator;

public class DecoratorDriver {

    public static void main(String[] args) {
        System.out.println("Test 1\n");
        Phone phone = new AndroidPhone(new BasicPhone());
        phone.printModel();
        System.out.println("\nTest 2\n");
        Phone iPhone = new IPhone(phone);
        iPhone.printModel();
    }
}
