import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.capacity) {
            this.items.add(packable);
        }
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (Packable item: this.items) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
