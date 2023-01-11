package org.example;

import java.util.HashMap;
import java.util.Map;

public class ResistorColorDuo {
    public static void main(String[] args) {
        System.out.println(ResistorColorDuo.value(new String[]{"green", "brown", "orange"}));
    }

    public static int value(String[] colors) {
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        String result = "";
        for (int j = 0; j < 2; j++) {
            if(map.get(colors[j]) != null)
               result = result + map.get(colors[j]);
        }
        return Integer.parseInt(result);
    }
}
