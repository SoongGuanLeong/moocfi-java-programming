public class Container {
    private String name;
    private int min;
    private int max;
    private int current;

    public Container(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.current = min;
    }

    public int getCurrent() {
        return current;
    }

    public void add(int amount) {
        if (amount <= 0) {
            return;
        }

        if (this.current + amount >= this.max) {
            this.current = this.max;
        } else {
            this.current += amount;
        }
    }

    public void remove(int amount) {
        if (amount <= 0) {
            return;
        }

        if (this.current - amount <= this.min) {
            this.current = this.min;
        } else {
            this.current -= amount;
        }
    }

    public String toString() {
        return this.name + ": " + this.current + "/" + this.max;
    }
}
