package chain_of_responsibility;

public class CoRTest {
    public static void main(String[] args) {
        AbstractLogger loggerChain = LoggerChain.getChain();

        loggerChain.logMessage(AbstractLogger.INFO, "lelel");
    }
}
