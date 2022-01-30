package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        
        XMLDocument xmlDocument = (XMLDocument) new DocumentFactory().getInstance("XML");
        PDFDocument pdfDocument = (PDFDocument) new DocumentFactory().getInstance("PDF");
        CSVDocument csvDocument = (CSVDocument) new DocumentFactory().getInstance("CSV");

        xmlDocument.initDocument("name");
        pdfDocument.initDocument("name");
        csvDocument.initDocument("name");

        System.out.println(xmlDocument.getName());
        System.out.println(pdfDocument.getName());
        System.out.println(csvDocument.getName());
    }
}
