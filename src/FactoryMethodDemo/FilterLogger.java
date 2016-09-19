package FactoryMethodDemo;

/**
 * Created by young on 16-9-18.
 */
public class FilterLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("Filter logger");
    }
}
