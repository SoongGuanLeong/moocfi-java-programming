package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {
    @Override
    public void start(Stage window) {
        // 1. Fetch the parameters passed into the launch method
        Parameters params = getParameters();
        
        // 2. Extract the value assigned to the key "title"
        String titleText = params.getNamed().get("title");

        // 3. Configure and open the window
        window.setTitle(titleText);
        window.show();
    }
}
