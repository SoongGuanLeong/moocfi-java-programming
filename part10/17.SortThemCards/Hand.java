import java.util.ArrayList;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream()
            .forEach(card -> System.out.println(card));
    }

    public void sort() {
        this.cards.sort(null);
    }

    public int sumValues() {
        return this.cards.stream()
            .mapToInt(card -> card.getValue())
            .sum();
    }

    @Override
    public int compareTo(Hand other) {
        return this.sumValues() - other.sumValues();
    }

    public void sortBySuit() {
        this.cards.sort(new BySuitInValueOrder());
    }
}
