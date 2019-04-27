package creational.builder;

public class DriverBuilder {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("deshraj","Thakur")
                .age(23)
                .phone("9599963810")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Ram","Singh")
                .age(25)
                .build();
        System.out.println(user2);
    }

}
