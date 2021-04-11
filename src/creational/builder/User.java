package creational.builder;

import java.util.function.Consumer;

public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    private User(UserBuilderULambda builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

   /* User(){}

    public User(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return "[firstName, "+this.firstName
                + " lastName, "+this.lastName
                + " phone, "+this.phone
                + " age, "+this.age
                + " address, "+this.address
                +" ]";
    }

    public static class UserBuilder{

        private  final String firstName;
        private  final String lastName; // firstName and lastName is mandatory
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            final User user = new User(this);
            if(validatingUser(user)){
                return null;
            }
            return user;
        }

        private boolean validatingUser(User user) {
            return (user.getFirstName() == null || user.getLastName() == null);
        }
    }

    public static class UserBuilderULambda{
        public   final String firstName;
        public   final String lastName; // firstName and lastName is mandatory
        public int age;
        public String phone;
        public String address;

        public UserBuilderULambda(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilderULambda with(Consumer<UserBuilderULambda> consumer){
            consumer.accept(this);
            return this;
        }

        public User buildWithLambda(){
            final User user = new User(this);
            return user;
        }
    }
}
