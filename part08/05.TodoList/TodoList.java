import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<String>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i=1; i <= tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i-1));
        }
    }

    public void remove(int number) {
        this.tasks.remove(number - 1);
    }
}
