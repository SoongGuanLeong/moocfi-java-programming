
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] words = line.split(",");
                if (Integer.valueOf(words[1]) == 1) {
                    System.out.println(words[0] + ", age: " + words[1] + " year");
                } else {
                    System.out.println(words[0] + ", age: " + words[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}
