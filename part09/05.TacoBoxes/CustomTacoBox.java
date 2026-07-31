public class CustomTacoBox implements TacoBox{
    private int cnt;

    public CustomTacoBox(int tacos) {
        this.cnt = tacos;
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
