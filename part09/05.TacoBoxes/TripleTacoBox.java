public class TripleTacoBox implements TacoBox{
    private int cnt;

    public TripleTacoBox() {
        this.cnt = 3;
    }

    public int tacosRemaining() {
        return this.cnt;
    }

    public void eat() {
        if (this.cnt > 0) {
            this.cnt--;
        }
    }
}
