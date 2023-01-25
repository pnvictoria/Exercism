package org.example;

public class ElonsToyCar {
    public int distanse;
    public int battery;

    public ElonsToyCar() {
        this.distanse = 0;
        this.battery = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanse + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", battery);
    }

    public void drive() {
        if (battery != 0) {
            distanse += 20;
            battery -= 1;
        }
    }
}

