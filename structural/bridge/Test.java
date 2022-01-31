package structural.bridge;

public class Test {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape penta = new Pentagon(new GreenColor());
        penta.applyColor();
    }
}
