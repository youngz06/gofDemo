package FactoryMethodDemo;

import sun.rmi.runtime.Log;

/**
 * Created by young on 16-9-18.
 */
public class FilterFactoryLogger implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new FilterLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object object) {
        Logger logger = new FilterLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        Logger logger = new FilterLogger();
        return logger;
    }
}
