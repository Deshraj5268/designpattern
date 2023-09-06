package behavioral.chainofresponsibility.loggersystem.processorhandler;

import behavioral.chainofresponsibility.loggersystem.LogLevel;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message){
        if(LogLevel.ERROR == logLevel){
            System.out.println(" logLevel: "+logLevel+ ", message:" + message);
        }else {
            System.out.println("trying for next level and current log level is not in "+LogLevel.ERROR);
            super.log(logLevel,message);
        }
    }
}
