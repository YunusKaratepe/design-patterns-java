package behavioral.templateMethod;

public class Test {
    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();

        // using template method
        houseTemplate.buildHouse();
        System.out.println("***************************");

        houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();

    }
}
