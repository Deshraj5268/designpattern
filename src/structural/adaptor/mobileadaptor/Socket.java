package structural.adaptor.mobileadaptor;

public class Socket {

    public final static int VOLTAGE = 120;

    public Volts getVolts(){

        return new Volts(VOLTAGE);
    }
}
