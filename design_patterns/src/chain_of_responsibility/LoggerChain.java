package chain_of_responsibility;

public class LoggerChain {
    private static AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    private static AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    private static AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    public static AbstractLogger getChain() {
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
