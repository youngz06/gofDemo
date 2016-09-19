package SingletonDemo;

/**
 * Created by young on 16-9-19.
 */
public class Singleton {
    private Singleton() {

    }

    private static class HolderClass {
            private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance () {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton s1,s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
            System.out.println(s1 == s2);
    }
}
