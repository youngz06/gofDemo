package factoryDemo;

/**
 * Created by young on 16-9-16.
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;

        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        }
        if (type.equalsIgnoreCase("line")) {
            chart = new HistogramChart();
        }
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        }


        return chart;
    }
}
