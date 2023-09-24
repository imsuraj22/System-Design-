class PDFDocument implements Document, Printable, Emailable {
    @Override
    public void open() {
        System.out.println("PDFDocument opened.");
    }

    @Override
    public void save() {
        System.out.println("PDFDocument saved.");
    }

    @Override
    public void print() {
        System.out.println("PDFDocument printed.");
    }

    @Override
    public void email() {
        System.out.println("PDFDocument emailed.");
    }
}