package io.littleworld.overloads;

import java.math.BigInteger;

public class Adder {
    int add(int a, int b) {
        return a + b;
    }

    // overload for doubles
    double add(double a, double b) {
        return a + b;
    }

    // overload for BigInteger
    BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
