import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String input1 = scanner.nextLine();
            if (input1.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int input2 = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int input3 = Integer.valueOf(scanner.nextLine());

            books.add(new Book(input1, input2, input3));
        }

        System.out.print("What information will be printed? ");
        String mode = scanner.nextLine();

        if (mode.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        }

        if (mode.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
