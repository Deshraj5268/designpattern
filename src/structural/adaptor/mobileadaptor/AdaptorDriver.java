package structural.adaptor.mobileadaptor;

public class AdaptorDriver {

    public static void testAdaptor(){
        SocketAdaptor socketAdaptor = new SocketAdaptorImpl();
        System.out.println(" v12 using adaptor : "+socketAdaptor.get12Volts().getVolts());

        System.out.println(" v3 using adaptor : "+socketAdaptor.get3Volts().getVolts());
    }


    public static void main(String[] args) {

        testAdaptor();
    }
}
