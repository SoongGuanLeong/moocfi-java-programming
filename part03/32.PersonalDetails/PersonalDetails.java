
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest_name = "";
        int total = 0;
        int cnt = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");

            if (longest_name.length() < words[0].length()) {
                longest_name = words[0];
            }

            total += Integer.valueOf(words[1]);
            cnt++;
        }
        System.out.println("Longest name: " + longest_name);
        System.out.println("Average of the birth years: " + (total * 1.0 / cnt));
    }
}
