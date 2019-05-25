package structural.flyweight.counterstrike;

public class CounterTerrorist implements Player {

    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist(){
        TASK = "BOMB DIFFUSE";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public boolean mission() {
        System.out.println("Counter terrorist with weapon "+ weapon +"  and task is "+TASK);
        return false;
    }
}
