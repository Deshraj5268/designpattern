package behavioral.chainofresponsibility.loggersystem;

import behavioral.chainofresponsibility.loggersystem.processorhandler.DebugLogProcessor;
import behavioral.chainofresponsibility.loggersystem.processorhandler.ErrorLogProcessor;
import behavioral.chainofresponsibility.loggersystem.processorhandler.InfoLogProcessor;
import behavioral.chainofresponsibility.loggersystem.processorhandler.LogProcessor;

public class LoggerDriver {

    public static void main(String[] args) {

        //preparing chain ..
        LogProcessor logger = new DebugLogProcessor(new InfoLogProcessor(new ErrorLogProcessor(null))); // need to check terminal condition

        logger.log(LogLevel.DEBUG, "debug log line");
        logger.log(LogLevel.ERROR, "Error log line");
        logger.log(null, "Error log line"); // we should check here itself
    }
}
