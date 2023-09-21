public class Logger {
    private static Logger instance;
    private String logData = "";

    private Logger() {
        // Private constructor to prevent external instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        logData += message + "\n";
    }

    public void printLog() {
        System.out.println("Log data:\n" + logData);
    }
}