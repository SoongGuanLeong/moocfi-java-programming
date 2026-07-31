public class Timer {
    private ClockHand seconds;
    private ClockHand centiseconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.centiseconds = new ClockHand(100);
    }

    public void advance() {
        this.centiseconds.advance();

        if (this.centiseconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds.toString() + ":" + this.centiseconds.toString();
    }
}
