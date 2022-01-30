package structural.composite;

public class Main {
    public static void main(String[] args) {
        
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();

        Shape[] shapes = {tri, tri1, cir};
        drawing.addMulti(shapes);

        Shape cir1 = new Circle();
        drawing.add(cir1);

        drawing.draw("Purple");

        
    }

}
