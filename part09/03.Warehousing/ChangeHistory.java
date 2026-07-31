import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double max = this.history.get(0);
        for (Double num: this.history) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double min = this.history.get(0);
        for (Double num: this.history) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        int cnt = 0;

        if (this.history.isEmpty()) {
            return 0;
        }

        for (double num: this.history) {
            sum += num;
            cnt ++;
        }

        return sum / cnt;
    }
}
