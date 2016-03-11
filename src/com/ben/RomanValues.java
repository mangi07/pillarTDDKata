package com.ben;

/**
 * Created by ben on 3/11/2016.
 */
public enum RomanValues {
    M(1000, "M", 1),
    D(500, "D", 5),
    C(100, "C", 1),
    L(50, "L", 5),
    X(10, "X", 1),
    V(5, "V", 5),
    I(1, "I", 1);

    final int value;
    final String symbol;
    final int baseType;

    RomanValues(int value, String symbol, int baseType) {
        this.value = value;
        this.symbol = symbol;
        this.baseType = baseType;
    }
}
