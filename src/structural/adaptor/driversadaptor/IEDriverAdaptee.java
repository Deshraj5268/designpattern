package structural.adaptor.driversadaptor;

public class IEDriverAdaptee {

    public String findDriver(){
        System.out.println("IEDriverAdaptee");
        return "IEDriverAdaptee";
    }

    public void startDriver(){
        System.out.println("IEDriverAdaptee starting ..");
    }
}
