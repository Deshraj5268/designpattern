package structural.adapter.driversadapter;

public class IEDriverAdaptee {

    public String findDriver(){
        System.out.println("IEDriverAdaptee");
        return "IEDriverAdaptee";
    }

    public void startDriver(){
        System.out.println("IEDriverAdaptee starting ..");
    }
}
