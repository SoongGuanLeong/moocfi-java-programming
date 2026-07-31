import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Collections;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        if (newBook == null) return;

        boolean alreadyExists = this.books.stream()
            .anyMatch(book -> book.getName().equalsIgnoreCase(newBook.getName()));

        if (alreadyExists) {
            return;
        }
        this.books.add(newBook);
    }

    public void sortBooks() {
        Comparator<Book> comparator = Comparator
            .comparing(Book::getRecommendedAge)
            .thenComparing(Book::getName);

        Collections.sort(this.books, comparator);
    }

    public String toString() {
        this.sortBooks();

        String bookList = this.books.stream()
            .map(book -> book.toString())
            .collect(Collectors.joining("\n"));

        return this.books.size() + " books in total.\n\nBooks:\n" + bookList;
    }
}
