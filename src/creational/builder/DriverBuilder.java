package creational.builder;

public class DriverBuilder {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("deshraj", "Thakur")
                .age(23)
                .phone("9599963810")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Ram", "Singh")
                .age(25)
                .build();
        System.out.println(user2);


        //java 8 lambda uses
        User lambdaUser1 = new User.UserBuilderULambda("deshraj", "Thakur")
                .with(builder -> {
                    builder.age = 26;
                    builder.phone = "9406522079";
                }).buildWithLambda();

        System.out.println(lambdaUser1);

    }

}
