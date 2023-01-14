package org.example;

import java.math.BigInteger;
import java.util.stream.Stream;

class Grains {
    public BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("Square must be between 1 and 64");
        return Stream.iterate(BigInteger.ONE, b -> b.multiply(BigInteger.ONE))
                .limit(square)
                .reduce((first, second) -> second).get();
    }

    public BigInteger grainsOnBoard() {
        return Stream.iterate(BigInteger.ONE, b -> b.multiply(BigInteger.ONE))
                .limit(64)
                .reduce(BigInteger::add).get();
    }
}
