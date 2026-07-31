
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cube = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            cube = Integer.valueOf(input) * Integer.valueOf(input) * Integer.valueOf(input);

            System.out.println(cube);
        }

    }
}
