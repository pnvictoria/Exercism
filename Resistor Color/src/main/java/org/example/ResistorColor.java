package org.example;

import java.util.HashMap;
import java.util.Map;

public class ResistorColor {
    int colorCode(String color) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Black", 0);
        map.put("Brown", 1);
        map.put("Red", 2);
        map.put("Orange", 3);
        map.put("Yellow", 4);
        map.put("Green", 5);
        map.put("Blue", 6);
        map.put("Violet", 7);
        map.put("Grey", 8);
        map.put("White", 9);
        return map.get(color);
    }

    public String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}

