import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicles.containsKey(licensePlate)) {
            return false;
        }
        this.vehicles.put(licensePlate, owner);
        return true;

    }

    public String get(LicensePlate licensePlate) {
        return this.vehicles.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicles.containsKey(licensePlate)) {
            this.vehicles.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp: this.vehicles.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner: this.vehicles.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }
}
