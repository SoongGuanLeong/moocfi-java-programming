package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    private boolean state;
    
    public TemperatureSensor() {
        this.state = false;
    }

    public boolean isOn() {
        return this.state;
    }

    public void setOn() {
        this.state = true;
    }

    public void setOff() {
        this.state = false;
    }

    public int read() {
        if (this.state = false) {
            throw new IllegalStateException();
        }

        Random rand = new Random();
        return rand.nextInt(30 + 30 + 1) - 30;  
    }
}
