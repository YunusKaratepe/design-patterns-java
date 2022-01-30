package creational.prototype;

public class Main {
    public static void main(String[] args) {
        
        UMLClass umlClass = null;
        UMLAttribute umlAttribute = null;

        try {
            umlClass = (UMLClass) new PrototypeFactory().getPrototype("Class");
        } catch (Exception e) {
            System.out.println("Exception occured while creating UMLClass.");
            e.printStackTrace();
        }

        try {
            umlAttribute = (UMLAttribute) new PrototypeFactory().getPrototype("Attribute");
        } catch (Exception e) {
            System.out.println("Exception occured while creating UMLAttribute.");
            e.printStackTrace();
        }

        System.out.println(umlClass.getClassName());
        System.out.println(umlAttribute.getAttributeName());

        umlClass.setClassName("New UML Class Name");
        umlAttribute.setAttributeName("New UML Attribute Name");

        System.out.println(umlClass.getClassName());
        System.out.println(umlAttribute.getAttributeName());

    }
}
