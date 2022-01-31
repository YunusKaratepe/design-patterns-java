package behavioral.templateMethod;

public abstract class HouseTemplate {
    
    // template method, final so subclasses can't override.
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built!");
    }

    // default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows...");
    }
    private void buildFoundation() {
        System.out.println("Building Foundation with Cement, Iron Rods and Sand...");
    }
    // methods to be implemented by subclasses.
    public abstract void buildWalls();
    public abstract void buildPillars();

    

    
}
