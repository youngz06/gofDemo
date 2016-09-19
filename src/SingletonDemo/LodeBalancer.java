package SingletonDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by young on 16-9-19.
 */
public class LodeBalancer {

    private static LodeBalancer instance = null;

    private List serverList = null;

    private LodeBalancer() {
        serverList = new ArrayList();
    }

    public static LodeBalancer getLodeBalancer() {
        if (instance == null) {
            instance = new LodeBalancer();
        }
        return instance;
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
