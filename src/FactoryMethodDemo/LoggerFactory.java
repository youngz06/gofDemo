package FactoryMethodDemo;

/**
 * Created by young on 16-9-18.
 */
public interface LoggerFactory {
    public Logger createLogger();

    public Logger createLogger(String args);

    public Logger createLogger(Object object);
}
