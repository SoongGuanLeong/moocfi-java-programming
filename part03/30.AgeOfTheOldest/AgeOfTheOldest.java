
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");

            if (oldest < Integer.valueOf(words[1])) {
                oldest = Integer.valueOf(words[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
