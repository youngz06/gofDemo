package AbstractFactoryDemo;

/**
 * Created by young on 16-9-19.
 */
public class SpringTextFiled implements TextFiled {
    @Override
    public void display() {
        System.out.println("to show green text border");
    }
}
