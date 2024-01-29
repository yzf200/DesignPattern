package com.fei.designpattern.chain;

public class Test {

    public static AbstractLogger getChainOfLogger(){
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debutLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(debutLogger);
        debutLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLogger();

        logger.logMessage(AbstractLogger.INFO," 这是一个Info级别的日志记录");
        logger.logMessage(AbstractLogger.DEBUG," 这是一个Debug级别的日志记录");
        logger.logMessage(AbstractLogger.ERROR," 这是一个Error级别的日志记录");

    }

}
