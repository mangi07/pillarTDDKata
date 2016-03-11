package com.ben;

/**
 * Created by ben on 3/11/2016.
 */
public enum RomanValues {
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
