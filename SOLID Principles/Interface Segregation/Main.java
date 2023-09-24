public class Main {
    public static void main(String[] args) {
        // Example usage of TextDocument
        Document textDoc = new TextDocument();
        textDoc.open();
        ((Printable) textDoc).print();

        // Example usage of PDFDocument
        Document pdfDoc = new PDFDocument();
        pdfDoc.open();
        ((Printable) pdfDoc).print(); 
        ((Emailable) pdfDoc).email(); 
    }
}