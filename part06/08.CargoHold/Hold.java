import java.util.ArrayList;

public class Hold {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases;

    public Hold(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int currentWeight = 0;

        for (Suitcase suitcase: this.suitcases) {
            currentWeight += suitcase.totalWeight();
        }
        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
