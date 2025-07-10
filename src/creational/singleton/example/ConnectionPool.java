package creational.singleton.example;

public class ConnectionPool {

    private int maxConnection;
    private String url;

    public void initialize(){
        maxConnection = 10;
        url =  "jdbc:mysql://localhost:3306/mydb";
        System.out.println("ConnectionPool initialized.");
    }

    public int getMaxConnection() {
        return maxConnection;
    }

    public String getUrl() {
        return url;
    }
}
