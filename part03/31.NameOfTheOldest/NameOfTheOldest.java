
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldest_name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");
            if (oldest < Integer.valueOf(words[1])) {
                oldest = Integer.valueOf(words[1]);
                oldest_name = words[0];
            }
        } 
        System.out.println("Name of the oldest: " + oldest_name);  

    }
}
