package structural.proxy.internateproxy;

public class InternetDriverProxy {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
