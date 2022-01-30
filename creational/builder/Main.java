package creational.builder;

public class Main {
    public static void main(String[] args) {
        DocCreationEngine engine = new DocCreationEngine();

        // Creating PDF Document...
        PDFDocBuilder pdfDocBuilder = new PDFDocBuilder();
        engine.generateDocument(pdfDocBuilder);
        PDFDocument pdfDoc = (PDFDocument) pdfDocBuilder.getDocument();
        

        // Creating XML Document...
        XMLDocBuilder xmlDocBuilder = new XMLDocBuilder();
        engine.generateDocument(xmlDocBuilder);
        XMLDocument xmlDoc = (XMLDocument) xmlDocBuilder.getDocument();

        System.out.println(pdfDoc.text);
        System.out.println(xmlDoc.text);

    }
}
