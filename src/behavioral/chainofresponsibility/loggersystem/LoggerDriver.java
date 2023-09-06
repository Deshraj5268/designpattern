package behavioral.chainofresponsibility.loggersystem;

import behavioral.chainofresponsibility.loggersystem.processorhandler.DebugLogProcessor;
import behavioral.chainofresponsibility.loggersystem.processorhandler.ErrorLogProcessor;
import behavioral.chainofresponsibility.loggersystem.processorhandler.InfoLogProcessor;
import behavioral.chainofresponsibility.loggersystem.processorhandler.LogProcessor;

public class LoggerDriver {

    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogLevel.DEBUG, "debug log line");
        logger.log(LogLevel.ERROR, "Error log line");
        logger.log(null, "Error log line");
    }
}
