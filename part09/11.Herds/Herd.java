import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void move(int dx, int dy) {
        for (Movable movable: this.herdList) {
            movable.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    public String toString() {
        String result = new String();
        for (Movable movable: this.herdList) {
            result += (movable.toString() + "\n");
        }
        return result;
    }
}
