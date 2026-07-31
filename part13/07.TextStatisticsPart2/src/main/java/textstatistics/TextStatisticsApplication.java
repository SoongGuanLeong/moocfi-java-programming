package textstatistics;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea("");
        layout.setCenter(textArea);

        Label letterLabel = new Label("Letters: 0");
        Label wordLabel = new Label("Words: 0");
        Label longestLabel = new Label("The longest word is:");

        HBox labels = new HBox();
        labels.setSpacing(10);
        labels.getChildren().add(letterLabel);
        labels.getChildren().add(wordLabel);
        labels.getChildren().add(longestLabel);

        layout.setBottom(labels);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            
            // Clean up surrounding whitespace and split by space
            String[] parts = newValue.trim().split("\\s+");
            int words = newValue.trim().isEmpty() ? 0 : parts.length;
            
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .orElse("");

            // Update your labels dynamically
            letterLabel.setText("Letters: " + characters);
            wordLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);
        });

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
