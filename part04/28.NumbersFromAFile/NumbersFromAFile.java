
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                int num = Integer.valueOf(reader.nextLine());
                list.add(num);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int cnt=0;
        for (int num: list) {
            if (num >= lowerBound && num <= upperBound) {
                cnt++;
            }
        }

        System.out.println("Numbers: " + cnt);
    }

}
