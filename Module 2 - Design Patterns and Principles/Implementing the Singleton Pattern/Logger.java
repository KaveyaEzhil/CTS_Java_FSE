public class Logger {

    private static volatile Logger obj;

    private Logger() {
        System.out.println("Logger Created");
    }

    public static Logger getInstance() {
        if (obj == null) {
            synchronized (Logger.class) {
                if (obj == null) {
                    obj = new Logger();
                }
            }
        }
        return obj;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}