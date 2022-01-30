package structural.composite;

// 2- leaf
public class Triangle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);        
    }

}