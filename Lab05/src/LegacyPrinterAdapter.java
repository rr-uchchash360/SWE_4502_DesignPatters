public class LegacyPrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String content) {
        // Adapt the modern print method to the legacy print method
        legacyPrinter.printLegacy(content);
    }
}