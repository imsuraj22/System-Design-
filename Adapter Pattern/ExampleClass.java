//target code can also be a class it is not necessary that it should only be an interface 



class Printer {
    void print(String text) {
        System.out.println("Printing: " + text);
    }
}

// Adaptee Class
class OldPrinter {
    void write(String text) {
        System.out.println("Writing: " + text);
    }
}

// Adapter for Adapting OldPrinter to Printer
class PrinterAdapter extends Printer {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    void print(String text) {
        // Delegate to the OldPrinter's write method
        oldPrinter.write(text);
    }
}

public class ExampleClass {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello, World!"); // Output: Printing: Hello, World!

        OldPrinter oldPrinter = new OldPrinter();
        Printer adapter = new PrinterAdapter(oldPrinter);
        adapter.print("Hello from the Old Printer!"); // Output: Writing: Hello from the Old Printer!
    }
}
