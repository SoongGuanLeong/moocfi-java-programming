package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane paintingLayout = new BorderPane();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext painter = canvas.getGraphicsContext2D();

        painter.setFill(Color.WHITE);
        painter.fillRect(0, 0, 400, 400);

        painter.setFill(Color.BLACK);
        // Draw Left Eye
        painter.fillRect(100, 100, 50, 50);
        
        // Draw Right Eye
        painter.fillRect(250, 100, 50, 50);
        
        // Draw Mouth corners
        painter.fillRect(50, 250, 50, 50);
        painter.fillRect(300, 250, 50, 50);
        
        // Draw Mouth base line
        painter.fillRect(100, 300, 200, 50);
        
        paintingLayout.setCenter(canvas);

        Scene view = new Scene(paintingLayout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
