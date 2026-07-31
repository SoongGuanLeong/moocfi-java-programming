package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;


public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        Label instructionText = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button startButton = new Button("Start");

        GridPane layout1 = new GridPane();
        layout1.add(instructionText, 0, 0);
        layout1.add(textField, 0, 1);
        layout1.add(startButton, 0, 2);

        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));

        Scene view1 = new Scene(layout1);


        Label welcomeText = new Label("Welcome!");

        StackPane layout2 = new StackPane();
        layout2.setPrefSize(300, 180);
        layout2.getChildren().add(welcomeText);
        layout2.setAlignment(Pos.CENTER);

        Scene view2 = new Scene(layout2);

        startButton.setOnAction((event) -> {
            if (textField.getText().trim().isEmpty()) {
                return;
            }
            welcomeText.setText("Welcome " + textField.getText() + "!");

            window.setScene(view2);
        });




        window.setScene(view1);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
