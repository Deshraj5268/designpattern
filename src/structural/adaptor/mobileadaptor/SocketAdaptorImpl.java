package structural.adaptor.mobileadaptor;

public class SocketAdaptorImpl extends Socket implements SocketAdaptor {


    @Override
    public Volts get120Volts(){
        Volts v= getVolts();
        return v;
    }

    @Override
    public Volts get12Volts(){
        Volts v = getVolts();
        return convertVolt(v,10);

    }

    @Override
    public Volts get3Volts(){
        Volts v = getVolts();
        return convertVolt(v,40);
    }

    public Volts convertVolt(Volts v, int i){
        return new Volts(v.getVolts()/i);
    }
}
