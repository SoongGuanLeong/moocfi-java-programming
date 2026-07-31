import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
            return;
        }
        this.cart.put(product, new Item(product, 1, price));
    }

    public int price() {
        int sum = 0;
        for (Item i :this.cart.values()) {
            sum += i.price();
        }
        return sum;
    }

    public void print() {
        for (Item i: this.cart.values()) {
            System.out.println(i);
        }
    }
}
