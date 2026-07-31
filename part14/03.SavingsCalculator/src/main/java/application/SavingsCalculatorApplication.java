package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainPane = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        yAxis.setAutoRanging(true);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");
        mainPane.setCenter(lineChart);

        VBox topContainer = new VBox();

        BorderPane pane1 = new BorderPane();
        Label slider1 = new Label("Monthly savings");
        Slider savingsSlider = new Slider(25, 250, 25);
        Label value1 = new Label("25");
        pane1.setLeft(slider1);
        pane1.setCenter(savingsSlider);
        pane1.setRight(value1);

        BorderPane pane2 = new BorderPane();
        Label slider2 = new Label("Yearly interest rate");
        Slider interestRateSlider = new Slider(0, 10, 0);
        Label value2 = new Label("0");
        pane2.setLeft(slider2);
        pane2.setCenter(interestRateSlider);
        pane2.setRight(value2);

        topContainer.getChildren().add(pane1);
        topContainer.getChildren().add(pane2);
        mainPane.setTop(topContainer);

        // Configure savingsSlider ticks
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);

        // Configure interestRateSlider ticks
        interestRateSlider.setShowTickMarks(true);
        interestRateSlider.setShowTickLabels(true);

        savingsSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            value1.setText(String.format("%.1f", newValue));
            double currentSavings = savingsSlider.getValue();
            double currentInterest = interestRateSlider.getValue();
            updateChart(currentSavings, currentInterest, lineChart);
        });

        interestRateSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            value2.setText(String.format("%.1f", newValue));
            double currentSavings = savingsSlider.getValue();
            double currentInterest = interestRateSlider.getValue();
            updateChart(currentSavings, currentInterest, lineChart);
        });


        updateChart(25, 0, lineChart);
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
    }

    public void updateChart(double savings, double interest, LineChart<Number, Number> chart) {
        chart.getData().clear();
        XYChart.Series<Number, Number> savingsSeries = new XYChart.Series<>();
        XYChart.Series<Number, Number> interestSeries = new XYChart.Series<>();

        double result = 0;
        double resWInterest = 0;
        savingsSeries.getData().add(new XYChart.Data<>(0, result));
        interestSeries.getData().add(new XYChart.Data<>(0, resWInterest));
        for (int i=1; i <= 30; i++) {
            result += savings * 12;
            resWInterest += savings * 12 * Math.pow(interest / 100 + 1, i);
            savingsSeries.getData().add(new XYChart.Data<>(i, result));
            interestSeries.getData().add(new XYChart.Data<>(i, resWInterest));
        }

        chart.getData().add(savingsSeries);
        chart.getData().add(interestSeries);
    }


    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
