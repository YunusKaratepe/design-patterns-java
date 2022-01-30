package creational.prototype;

import java.util.HashMap;

public class PrototypeFactory {
    
    private static HashMap <String, Prototype> cloneMap = new HashMap<String, Prototype>();

    static {
        cloneMap.put("Class", new UMLClass());
        cloneMap.put("Attribute", new UMLAttribute());
    }
        
    

    public Prototype getPrototype(String identifier) throws CloneNotSupportedException {
        
        switch (identifier) {
            case "Class":
                return cloneMap.get("Class").clone();
            case "Attribute":
                return cloneMap.get("Attribute").clone();
        }

        return null;
    }

}
