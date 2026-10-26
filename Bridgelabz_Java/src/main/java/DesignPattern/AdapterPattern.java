
/*
Program 6: Adapter Design Pattern

Purpose:
Adapter Pattern allows incompatible interfaces to work together.
The adapter connects the old printer to the new printer interface.
*/

// New printer interface
interface NewPrinter {
    void print();
}

// Existing printer with a different method name
class OldPrinter {
    void oldPrint() {
        System.out.println("Printing using old printer");
    }
}

// Adapter makes the old printer compatible with NewPrinter
class PrinterAdapter implements NewPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print() {
        // Translate the new print() call into the old method call
        oldPrinter.oldPrint();
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        // Create the existing printer
        OldPrinter oldPrinter = new OldPrinter();

        // Wrap the old printer using the adapter
        NewPrinter printer = new PrinterAdapter(oldPrinter);

        // Use the new interface to print
        printer.print();
    }
}
