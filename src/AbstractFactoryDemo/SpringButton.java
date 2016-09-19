package AbstractFactoryDemo;

/**
 * Created by young on 16-9-19.
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("this is a green button");
    }
}
