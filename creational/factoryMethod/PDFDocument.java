package creational.factoryMethod;

public class PDFDocument implements Document {

    private String name;

    @Override
    public void initDocument(String name) {
        this.name = "PDF_" + name;
    }

    public String getName() {
        return name;
    }
}
