class TextDocument implements Document, Printable {
    @Override
    public void open() {
        System.out.println("TextDocument opened.");
    }

    @Override
    public void save() {
        System.out.println("TextDocument saved.");
    }

    @Override
    public void print() {
        System.out.println("TextDocument printed.");
    }
}