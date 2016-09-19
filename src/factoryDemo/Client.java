package factoryDemo;

/**
 * Created by young on 16-9-16.
 */
public class Client {/*
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("line");
        chart.display();
    }*/

    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType();//read the parameters from XML file
        chart = ChartFactory.getChart(type);//Create factory object
        chart.display();
    }
}
