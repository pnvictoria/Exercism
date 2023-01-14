package org.example;

public class RaindropConverter {
    public String convert(int number) {
        StringBuilder s = new StringBuilder();
        if (number % 3 == 0)
            s.append("Pling");
        if (number % 5 == 0)
            s.append("Plang");
        if (number % 7 == 0)
            s.append("Plong");
        if ((number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0))
            s.append(number);
        return s.toString();
    }
}

