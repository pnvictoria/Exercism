package org.example;

public class DifferenceOfSquaresCalculator {
    public int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return (int) Math.pow(sum, 2);
    }

    public int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        return sumOfSquares;
    }

    public int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
