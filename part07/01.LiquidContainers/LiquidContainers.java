
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            System.out.println("");

            if (input.equals("quit")) {
                break;
            }

            String[] words = input.split(" ");
            String command = words[0];
            int number = Integer.valueOf(words[1]);

            // part 1
            if (command.equals("add")) {
                if (number <= 0) {
                    continue;
                }
                first += number;

                if (first > 100) {
                    first = 100;
                }
            }

            // part 2
            if (command.equals("move")) {
                if (number <= 0) {
                    continue;
                }

                if (number > first) {
                    number = first;
                }

                first -= number;
                second += number;
                
                if (second > 100) {
                    second = 100;
                }
            }

            //part 3
            if (command.equals("remove")) {
                if (number <= 0) {
                    continue;
                }

                second -= number;

                if (second < 0) {
                    second = 0;
                }
            }
        }
    }

}
