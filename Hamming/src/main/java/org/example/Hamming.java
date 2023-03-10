package org.example;

import java.util.stream.IntStream;

public class Hamming {
    private final String leftStrand;
    private final String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() > rightStrand.length() && rightStrand.length() != 0) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if (leftStrand.length() < rightStrand.length() && leftStrand.length() != 0) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        if (leftStrand.isEmpty() && rightStrand.length() != 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.isEmpty() && leftStrand.length() != 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    long getHammingDistance() {
        long hammingDis = IntStream
                .range(0, leftStrand.length())
                .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                .count();
        return hammingDis;
    }
}