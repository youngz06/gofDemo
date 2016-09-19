package factoryDemo;

/**
 * Created by young on 16-9-16.
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("To create line chart");
    }

    @Override
    public void display() {
        System.out.println("To show line chart");
    }
}
