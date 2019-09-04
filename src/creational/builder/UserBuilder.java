package creational.builder;

public class UserBuilder {

    private  String firstName;
    private  String lastName;
    private int age;
    private String phone;
    private String address;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public User build(){
        return new User(firstName,lastName,age,phone,address);

    }
}
