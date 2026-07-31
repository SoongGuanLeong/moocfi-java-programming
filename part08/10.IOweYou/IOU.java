import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owed;

    public IOU() {
        this.owed = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        // double zeroIfNull = this.owed.getOrDefault(toWhom, 0.0);
        this.owed.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.owed.getOrDefault(toWhom, 0.0);
    }
}
