package org.example;

public class Darts {
    public int score(double xOfDart, double yOfDart) {
        double sqrt = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        if(sqrt < 1 || sqrt == 1)
            return 10;
        if (sqrt < 5 || sqrt == 5)
            return 5;
        if (sqrt < 10 || sqrt == 10)
            return 1;
        return 0;
    }
}

