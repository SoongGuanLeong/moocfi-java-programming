
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Person> people = readPeople("literacy.csv");
        people.stream()
            .sorted()
            .forEach(m -> System.out.println(m));
    }

    public static ArrayList<Person> readPeople(String file) {
        ArrayList<Person> people = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .filter(parts -> parts.length >= 6)
                .map(parts -> new Person(parts))
                .forEach(person -> people.add(person));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return people;
    }
}
