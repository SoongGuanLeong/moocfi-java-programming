public class Container {
    private int min;
    private int max;
    private int current;

    public Container(int min, int max) {
        this.min = min;
        this.max = max;
        this.current = min;
    }

    public Container() {
        this.min = 0;
        this.max = 100;
        this.current = min;
    }

    public int contains() {
        return this.current;
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
        return this.current + "/" + this.max;
    }
}
