package creational.prototype;

public class UMLAttribute implements Prototype {
    
    private String attributeName = "Default Prototype Attribute Name";
    
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    @Override
    public UMLAttribute clone() throws CloneNotSupportedException {
        System.out.println("Creating clone of UMLAttribute...");
        return (UMLAttribute) super.clone();
    }

}
