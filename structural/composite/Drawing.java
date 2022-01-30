package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapes = null;

    public Drawing () {
        this.shapes = new ArrayList<Shape>();
    }

    @Override
    public void draw(String fillColor) {
        for(Shape s: shapes) {
            s.draw(fillColor);
        }
    }

    public boolean add(Shape s) {
        return this.shapes.add(s);
    }

    public void addMulti(Shape[] shapes) {
        for (Shape s : shapes) {
            this.shapes.add(s);
        }
    }

    public boolean remove(Shape s) {
        return this.shapes.remove(s);
    }

    public void clear() {
        System.out.println("Clearing all the shapes from drawing...");
        this.shapes.clear();
    }
    
}
