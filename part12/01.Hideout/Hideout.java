public class Hideout<T> {
    private T item;

    public Hideout() {}

    public void putIntoHideout(T toHide) {
        this.item = toHide;
    }

    public T takeFromHideout() {
        T taken = this.item;
        this.item = null;
        return taken;
    }

    public boolean isInHideout() {
        return this.item != null;
    }
}
