import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int current = 0;
        for (Item i: this.items) {
            current += i.getWeight();
        }
        if (current + item.getWeight() > this.capacity) {
            return;
        }
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
