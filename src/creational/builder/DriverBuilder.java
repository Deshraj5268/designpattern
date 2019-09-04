package creational.builder;

public class DriverBuilder {

    public static void main(String[] args) {
        User user1 = new UserBuilder().setFirstName("deshraj").setLastName("Thakur")
                .setAge(23)
                .setPhone("9599963810")
                .build();

        System.out.println(user1);

        User user2 = new UserBuilder().setFirstName("Ram").setLastName("Singh")
                .setAge(25)
                .build();
        System.out.println(user2);
    }

}
