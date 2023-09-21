public class Main {
    public static void main(String[] args) {
        // Create a legacy printer instance
        LegacyPrinter legacyPrinter = new LegacyPrinterImpl();

        // Create an adapter for the legacy printer
        ModernPrinter modernPrinter = new LegacyPrinterAdapter(legacyPrinter);

        // Use the modern printer interface to print
        modernPrinter.print("This is a document.");

        // This will invoke the legacy printer through the adapter
    }
}