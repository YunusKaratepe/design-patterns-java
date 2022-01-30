package creational.builder;

public class PDFDocBuilder extends DocBuilder{

    private PDFDocument pdfDoc;

    @Override
    public void createDocument() {
        this.pdfDoc = new PDFDocument();        
    }

    @Override
    public void createText() {
        System.out.println("Creating text for PDF Document."); 
        this.pdfDoc.text = "PDF Text YEY!";       
    }

    @Override
    public void createImages() {
        System.out.println("Creating images for PDF Document.");    
        this.pdfDoc.images = "PDF Image YEY!";
    }

    @Override
    public Document getDocument() {
        System.out.println("Fetching the PDF Document.");
        return this.pdfDoc;
    }
    
}
