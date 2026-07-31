package application;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // xAxis.setLabel("Year");
        // yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        int[] years = {1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008};

        try (Scanner scanner = new Scanner(new File("partiesdata.tsv"))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();         // discard header
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] points = line.split("\t");

                String name = points[0];
                XYChart.Series<Number, Number> data = new XYChart.Series<>();
                data.setName(name);

                for (int i = 0; i < years.length; i++) {
                    // Safety check to ensure we don't exceed the split array length
                    if (i + 1 < points.length) {
                        String stringVal = points[i + 1];

                        // Match your exact data exclusion filter logic using standard .equals()
                        if (stringVal != null && !stringVal.trim().isEmpty() && !stringVal.equals("-")) {
                            data.getData().add(new XYChart.Data<>(years[i], Double.valueOf(stringVal)));
                        }
                    }
                }

                lineChart.getData().add(data);
            }
        } catch (Exception e) {
            System.out.println("Error when reading data: " + e.getMessage());
        }

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
