package behavioral.template.designhouse;

public class WoodenHouseTemplate extends HouseTemplate{
    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }
}
