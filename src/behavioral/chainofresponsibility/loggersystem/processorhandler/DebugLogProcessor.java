package behavioral.chainofresponsibility.loggersystem.processorhandler;

import behavioral.chainofresponsibility.loggersystem.LogLevel;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message){
        if(LogLevel.DEBUG == logLevel){
            System.out.println(" logLevel: "+logLevel+ ", message:" + message);
        }else {
            System.out.println("trying for next level and current log level is not in "+LogLevel.DEBUG);
            super.log(logLevel,message);
        }
    }
}
