
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

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
                first.add(number);
            }

            // part 2
            if (command.equals("move")) {
                if (first.contains() < number) {
                    number = first.contains();
                }
                first.remove(number);
                second.add(number);
            }

            //part 3
            if (command.equals("remove")) {
                second.remove(number);
            }
        }
    }

}
