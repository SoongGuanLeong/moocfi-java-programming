import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        if (this.values.size() == 0) { return null; }

        int removeIndex = this.values.size() - 1;
        T removedItem = this.values.get(removeIndex);

        this.values.remove(removeIndex);
        return removedItem;
    }

    public boolean isInPipe() {
        return this.values.size() == 0;
    }
}
