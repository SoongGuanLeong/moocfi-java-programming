import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int currentWeight = 0;

        for (Item item: this.items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.weightLimit) {
            this.items.add(item);
        }
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        int heaviest = 0;
        Item heaviestItem = new Item(null, heaviest);

        if (this.items.size() == 0) {
            return null;
        }

        for (Item item: this.items) {
            if (item.getWeight() > heaviest) {
                heaviest = item.getWeight();
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
