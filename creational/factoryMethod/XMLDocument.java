package creational.factoryMethod;


public class XMLDocument implements Document {
    private String name;

    @Override
    public void initDocument(String name) {
        this.name = "XML_" + name;
    }

    public String getName() {
        return name;
    }
}
