package structural.proxy.internateproxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost){
        System.out.println("conecting to serverHost : "+serverHost);
    }
}
