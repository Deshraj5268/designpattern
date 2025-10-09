package creational.objectpoolpattern;

public class MyDBConncetion {

    private MyDBConncetion connection;

    String userName;
    String password;
    String url;
    public MyDBConncetion(){
        this.userName= "userName";
        this.password = "password";
        this.url = "url";
    }
}
