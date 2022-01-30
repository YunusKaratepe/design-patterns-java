package creational.factoryMethod;


public class CSVDocument implements Document{
    private String name;

    @Override
    public void initDocument(String name) {
        this.name = "CSV_" + name;
    }

    public String getName() {
        return name;
    }
}
