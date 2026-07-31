
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter password: ");
        String input2 = scanner.nextLine();

        for (int i=0; i < username.length; i++) {
            if (input1.equals(username[i])) {
                if (input2.equals(password[i])) {
                    System.out.println("You have successfully logged in!");
                    return;
                }
            }
        }
        System.out.println("Incorrect username or password!");
    }
}
