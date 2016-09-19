package factoryDemo;

/**
 * Created by young on 16-9-16.
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("to Create pie chart");
    }

    @Override
    public void display() {
        System.out.println("to show pie chart");
    }
}
