package FactoryMethodDemo;

/**
 * Created by young on 16-9-19.
 */
public class Client {
 /*   public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FilterFactoryLogger();//add file to implement
        logger = factory.createLogger();
        logger.writeLog()/*;
    }*/
    public static void main(String[] args) {
        LoggerFactory loggerFactory ;
        Logger logger;
        loggerFactory = (LoggerFactory) XMLUtil.getBean();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
