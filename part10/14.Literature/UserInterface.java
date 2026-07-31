import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BookManager manager;

    public UserInterface(Scanner scanner, BookManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            System.out.println();

            this.manager.addBook(new Book(name, age));
        }
        System.out.println("");
        System.out.println(this.manager);
    }
}
