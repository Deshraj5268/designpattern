package creational.builder;

public class User {

    private  String firstName;
    private  String lastName;
    private  int age;
    private  String phone;
    private  String address;

   /* private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }*/

   public User(){}

    public User(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

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
        return this.firstName + this.lastName + this.phone + this.age + this.address;
    }

    /*public static class UserBuilder{

        private  String firstName;
        private  String lastName;
        private int age;
        private String phone;
        private String address;

       *//* public UserBuilder(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }*//*

       public UserBuilder firstName(String firstName){
           this.firstName = firstName;
           return this;
       }

       public UserBuilder lastName(String lastName){
           this.lastName = lastName;
           return this;
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
            return new User(this);
        }
    }*/
}
