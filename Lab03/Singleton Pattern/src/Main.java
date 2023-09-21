public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Log entry 1");
        logger2.log("Log entry 2");

        logger1.printLog();  // Both log entries will be present in the log
    }
}