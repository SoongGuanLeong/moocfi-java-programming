package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readHistory;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readHistory = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOn() {
        return this.sensors.stream()
            .allMatch(sensor -> sensor.isOn());
    }

    public void setOn() {
        this.sensors.stream()
            .forEach(sensor -> sensor.setOn());
    }

    public void setOff() {
        this.sensors.stream()
            .forEach(sensor -> sensor.setOff());
    }

    public int read() {
        if (!this.isOn() || this.sensors.size() == 0) {
            throw new IllegalStateException();
        }

        int result = (int) this.sensors.stream()
            .mapToInt(sensor -> sensor.read())
            .average()
            .getAsDouble();

        this.readHistory.add(result);

        return result;
    }

    public List<Integer> readings() {
        return this.readHistory;
    }
}
