
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        if (option.equals("n")) {
            Double result = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

            System.out.println("Average of the negative numbers: " + result);
        }

        if (option.equals("p")) {
            Double result = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + result);
        }

    }
}
