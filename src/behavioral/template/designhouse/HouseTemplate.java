package behavioral.template.designhouse;

public abstract class HouseTemplate {

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("house is built");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
    public abstract void buildPillars();
    public abstract void buildWalls();
    public void buildWindows(){
        System.out.println("Building Glass Windows");
    }
}
