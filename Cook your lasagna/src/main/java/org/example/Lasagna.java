package org.example;

public class Lasagna {
    public int cookTime;
    public int layerCookTime;

    public Lasagna() {
        this.cookTime = 40;
        this.layerCookTime = 2;
    }

    public Lasagna(int cookTime, int layerCookTime) {
        this.cookTime = cookTime;
        this.layerCookTime = layerCookTime;
    }

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int timeInOven) {
        return cookTime - timeInOven;
    }

    public int preparationTimeInMinutes(int layerCount) {
        return layerCount * layerCookTime;
    }

    public int totalTimeInMinutes(int layerCount, int timeInOven) {
        return (layerCount * layerCookTime) + timeInOven;
    }
}
