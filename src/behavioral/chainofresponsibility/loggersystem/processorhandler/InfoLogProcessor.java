package behavioral.chainofresponsibility.loggersystem.processorhandler;

import behavioral.chainofresponsibility.loggersystem.LogLevel;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message){
        if(LogLevel.INFO == logLevel){
            System.out.println(" logLevel: "+logLevel+ ", message:" + message);
        }else {
            System.out.println("trying for next level and current log level is not in "+LogLevel.INFO);
            super.log(logLevel,message);
        }
    }
}
