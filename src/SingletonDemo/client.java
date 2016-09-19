package SingletonDemo;

/**
 * Created by young on 16-9-19.
 */
public class client {
    public static void main(String[] args) {
        LodeBalancer lodeBalancer1,lodeBalancer2,lodeBalancer3,lodeBalancer4;
        lodeBalancer1 = LodeBalancer.getLodeBalancer();
        lodeBalancer2 = LodeBalancer.getLodeBalancer();
        lodeBalancer3 = LodeBalancer.getLodeBalancer();
        lodeBalancer4 = LodeBalancer.getLodeBalancer();


        if (lodeBalancer1 == lodeBalancer2 && lodeBalancer2 == lodeBalancer3 && lodeBalancer3 == lodeBalancer4) {
            System.out.println("true");
        }

        lodeBalancer1.addServer("server1");
        lodeBalancer1.addServer("server2");
        lodeBalancer1.addServer("server3");
        lodeBalancer1.addServer("server4");

        for(int i=0;i<10;i++) {
            String server = lodeBalancer1.getServer();
            System.out.println("to distribute the lodeBalancer to " + server);
        }

    }
}
