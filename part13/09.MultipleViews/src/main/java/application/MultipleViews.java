package application;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layoutA = new BorderPane();
        Label textA = new Label("First view!");
        Button buttonA = new Button("To the second view!");
        layoutA.setTop(textA);
        layoutA.setCenter(buttonA);
        Scene view1 = new Scene(layoutA);

        VBox layoutB = new VBox();
        Button buttonB = new Button("To the third view!");
        Label textB = new Label("Second view!");
        layoutB.getChildren().add(buttonB);
        layoutB.getChildren().add(textB);
        Scene view2 = new Scene(layoutB);

        GridPane layoutC = new GridPane();
        Label textC = new Label("Third view!");
        Button buttonC = new Button("To the first view!");
        layoutC.add(textC, 0, 0);
        layoutC.add(buttonC, 0, 1);
        Scene view3 = new Scene(layoutC);
        
        buttonA.setOnAction((event) -> {window.setScene(view2);});
        buttonB.setOnAction((event) -> {window.setScene(view3);});
        buttonC.setOnAction((event) -> {window.setScene(view1);});

        window.setScene(view1);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
