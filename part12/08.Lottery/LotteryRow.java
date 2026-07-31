
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random rand = new Random();
        // the method containsNumber is probably useful
        while (this.numbers.size() < 7) {
            int number = rand.nextInt(40) + 1;
            if (!this.containsNumber(number)) {
                this.numbers.add(number);
            }
        }
        this.numbers.sort(null);
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

