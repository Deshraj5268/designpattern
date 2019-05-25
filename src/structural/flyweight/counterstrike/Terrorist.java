package structural.flyweight.counterstrike;

public class Terrorist implements Player {

    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist(){
        TASK = "PLANT BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public boolean mission() {
        System.out.println("terrorist with weapon "+ weapon +"  and task is "+TASK);
        return false;
    }
}
