package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Ask the user for the title in the console
        System.out.print("Please enter a title for the application: ");
        String userInput = scanner.nextLine();
        
        // 2. Format the argument exactly as required by JavaFX: "--key=value"
        String titleParameter = "--title=" + userInput;
        
        // 3. Launch the JavaFX application from outside its own class, passing the argument
        Application.launch(UserTitle.class, titleParameter);
    }
}
