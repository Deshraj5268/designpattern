package behavioral.chainofresponsibility.loggersystem.processorhandler;

import behavioral.chainofresponsibility.loggersystem.LogLevel;

public abstract class LogProcessor {

    LogProcessor nexLogProcessor;

    public LogProcessor(LogProcessor nexLogProcessor){
        this.nexLogProcessor = nexLogProcessor;
    }

    public void log(LogLevel logLevel,String message){
        if(nexLogProcessor != null){
            nexLogProcessor.log(logLevel,message);
        }else {
            System.out.println("no log level matching ");
        }
    }
}
