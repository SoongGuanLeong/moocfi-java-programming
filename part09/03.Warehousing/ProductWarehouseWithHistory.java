public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory hist;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.hist = new ChangeHistory();
        this.hist.add(initialBalance);
    }

    public String history() {
        return hist.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.hist.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        this.hist.add(super.getBalance());
        return amountTaken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.hist.toString());
        System.out.println("Largest amount of product: " + this.hist.maxValue());
        System.out.println("Smallest amount of product: " + this.hist.minValue());
        System.out.println("Average: " + this.hist.average());
    }
}
