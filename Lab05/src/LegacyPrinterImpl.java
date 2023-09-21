public class LegacyPrinterImpl implements LegacyPrinter {
    @Override
    public void printLegacy(String content) {
        System.out.println("Legacy Printer is printing: " + content);
    }
}