import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceDict;
    private Map<String, Integer> stockDict;

    public Warehouse() {
        this.priceDict = new HashMap<>();
        this.stockDict = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.priceDict.put(product, price);
        this.stockDict.put(product, stock);
    }

    public int price(String product) {
        if (this.priceDict.containsKey(product)) {
            return this.priceDict.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stockDict.containsKey(product)) {
            return this.stockDict.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.stock(product) > 0) {
            this.stockDict.put(product, this.stock(product) - 1);
            return true;
        } 
        return false;
    }

    public Set<String> products() {
        return this.priceDict.keySet();
    }
}
