package creational.builder;

public class XMLDocBuilder extends DocBuilder{
    private XMLDocument xmlDoc;

    @Override
    public void createDocument() {
        this.xmlDoc = new XMLDocument();        
    }

    @Override
    public void createText() {
        System.out.println("Creating text for XML Document."); 
        this.xmlDoc.text = "XML Text YEY!";       
    }

    @Override
    public void createImages() {
        System.out.println("In XML, no need for images.\nNone are created.");    
    }

    @Override
    public Document getDocument() {
        System.out.println("Fetching the XML Document.");
        return this.xmlDoc;
    }
}
