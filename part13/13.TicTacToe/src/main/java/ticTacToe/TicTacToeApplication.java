package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class TicTacToeApplication extends Application {

    private String currentTurn = "X";
    private boolean isGameOver = false;

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        Label turnInfo = new Label("Turn: X");
        turnInfo.setFont(Font.font("Monospaced", 40));
        layout.setTop(turnInfo);
        BorderPane.setMargin(turnInfo, new Insets(10));

        GridPane board = new GridPane();
        board.setAlignment(Pos.CENTER);
        board.setHgap(10);
        board.setVgap(10);

        Button[][] buttons = new Button[3][3];

        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                Button button = new Button("");
                button.setFont(Font.font("Monospaced", 40));
                button.setPrefSize(90, 90);

                button.setOnAction((event) -> {
                    if (!button.getText().isEmpty() || isGameOver) {
                        return;
                    }

                    button.setText(currentTurn);

                    if (checkWinner(buttons)) {
                        isGameOver = true;
                        turnInfo.setText("The end!");
                        return;
                    }

                    if (currentTurn.equals("X")) {
                        currentTurn = "O";
                    } else {
                        currentTurn = "X";
                    }

                    turnInfo.setText("Turn: " + currentTurn);
                });

                buttons[i][j] = button;
                board.add(button, i, j);
            }
        }

        layout.setCenter(board);
        Scene scene = new Scene(layout, 350, 400);
        stage.setScene(scene);
        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }

    private boolean checkWinner(Button[][] buttons) {
        for (int i=0; i < 3; i++) {
            if (checkThree(buttons[i][0], buttons[i][1], buttons[i][2])) {return true;}
            if (checkThree(buttons[0][i], buttons[1][i], buttons[2][i])) {return true;}
        }
        if (checkThree(buttons[0][0], buttons[1][1], buttons[2][2])) {return true;}
        if (checkThree(buttons[0][2], buttons[1][1], buttons[2][0])) {return true;}

        return false;
    }

    private boolean checkThree(Button b1, Button b2, Button b3) {
        String s1 = b1.getText();
        return !s1.isEmpty() && s1.equals(b2.getText()) && s1.equals(b3.getText());
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
