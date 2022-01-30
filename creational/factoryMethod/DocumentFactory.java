package creational.factoryMethod;

public class DocumentFactory {
    public Document getInstance(String docIdentifier) {
        switch(docIdentifier) {
            case "XML": return new XMLDocument();
            case "PDF": return new PDFDocument();
            case "CSV": return new CSVDocument();
        }
        return null;
    }
}
