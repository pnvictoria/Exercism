package org.example;

public class Twofer {
    public static void main(String[] args) {
        Twofer.twofer("Victria");
        Twofer.twofer(null);
    }

    static String twofer(String identifier) {
        return identifier == null ? "One for you, one for me." : "One for " + identifier + ", one for me.";
    }
}

