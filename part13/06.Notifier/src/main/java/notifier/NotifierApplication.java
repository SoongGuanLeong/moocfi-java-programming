package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        // BorderPane layout = new BorderPane();

        TextField topText = new TextField();
        Label bottomText = new Label();
        Button button = new Button("Update");

        button.setOnAction((event) -> {
            bottomText.setText(topText.getText());
        });

        VBox items = new VBox();
        items.getChildren().add(topText);
        items.getChildren().add(button);
        items.getChildren().add(bottomText);

        // layout.setTop(items);

        Scene view = new Scene(items);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
