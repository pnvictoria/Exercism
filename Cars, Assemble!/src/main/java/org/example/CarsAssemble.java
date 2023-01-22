package org.example;

public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        return 221.0 * speed * this.successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)this.productionRatePerHour(speed) / 60;
    }

    public double successRate(int speed) {
        if (speed >= 1 && speed <= 4) {
            return 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else {
            return speed == 10 ? 0.77 : 0.0;
        }
    }
}