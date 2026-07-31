public class OneItemBox extends Box {
    private Item itemInBox;

    public OneItemBox() {}

    @Override
    public void add(Item item) {
        if (this.itemInBox == null) {
            this.itemInBox = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.itemInBox == null) {
            return false;
        }

        return this.itemInBox.equals(item);
    }
}
