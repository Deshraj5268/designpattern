package behavioral.template.designhouse;

public class HouseDriver {

    public static void main(String[] args) {
        HouseTemplate glassHouseTemplate = new GlassHouseTemplate();
        glassHouseTemplate.buildHouse();


        HouseTemplate woodenHouseTemplate = new WoodenHouseTemplate();
        woodenHouseTemplate.buildHouse();
    }
}
