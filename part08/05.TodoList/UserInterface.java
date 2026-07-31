import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList list, Scanner s) {
        this.todoList = list;
        this.scanner = s;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.todoList.add(task);
            }

            if (command.equals("list")) {
                this.todoList.print();
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index1 = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(index1);
            }
        }
    }
}
