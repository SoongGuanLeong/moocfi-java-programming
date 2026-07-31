
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("First", 0, 100);
        Container second = new Container("Second", 0, 100);


        while (true) {
            System.out.println(first);
            System.out.println(second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] words = input.split(" ");
            String command = words[0];
            int amount = Integer.valueOf(words[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (first.getCurrent() < amount) {
                    amount = first.getCurrent();
                }
                first.remove(amount);
                second.add(amount);
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }

            System.out.println("");
        }
    }

}
