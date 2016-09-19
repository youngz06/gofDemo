package SingletonDemo;

import java.util.Enumeration;

/**
 * Created by young on 16-9-19.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
