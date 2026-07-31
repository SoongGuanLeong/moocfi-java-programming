import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> buckets;

    public StorageFacility() {
        this.buckets = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.buckets.putIfAbsent(unit, new ArrayList<>());
        this.buckets.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.buckets.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return this.buckets.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (!this.buckets.containsKey(storageUnit)) {
            return;
        }

        this.buckets.get(storageUnit).remove(item);

        if (this.buckets.get(storageUnit).isEmpty()) {
            this.buckets.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList<>();
        for (String bucket: this.buckets.keySet()) {
            if (!(this.buckets.get(bucket) == null)) {
                result.add(bucket);
            }
        }
        return result;
    }
}
