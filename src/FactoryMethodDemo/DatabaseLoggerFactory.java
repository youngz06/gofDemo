package FactoryMethodDemo;

/**
 * Created by young on 16-9-18.
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        // connect to database , ignore now

        Logger logger = new DatabaseLogger();
        //initial database logger,ignore now
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        //use args parameter to connect to database ,ignore now;
        Logger logger = new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object object) {
        //use object parameter to connect to database,ignore code now;

        Logger logger = new DatabaseLogger();

        return logger;
    }
}
