package Exercise2;

public class FactoryMethodTest {
    public static void main(String[] args) {
    // create factories for each document type  
    DocumentFactory wordFactory = new WordDocumentFactory();
    DocumentFactory pdfFactory = new PdfDocumentFactory();
    DocumentFactory excelFactory = new ExcelDocumentFactory();

    // create documents using the factories
    Document wordDoc = wordFactory.createDocument();
    Document pdfDoc = pdfFactory.createDocument();
    Document excelDoc = excelFactory.createDocument();

    // open and close each document
    wordDoc.open();
    wordDoc.close();

    pdfDoc.open();
    pdfDoc.close();

    excelDoc.open();
    excelDoc.close();
    }
}
