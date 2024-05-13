package structural.adapter.mobileadapter;

public class Socket {

    public final static int VOLTAGE = 120;

    public Volts getVolts(){

        return new Volts(VOLTAGE);
    }
}
