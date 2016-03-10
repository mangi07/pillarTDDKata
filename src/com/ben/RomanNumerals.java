package com.ben;

/**
 * Created by ben on 3/10/2016.
 */
public class RomanNumerals {
    public String arabicToRoman(Integer arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();
        if (arabicNumber < 3) {
            for (int i = 0; i < arabicNumber; ++i) {
                romanNumber.append("I");
            }
        }
        return romanNumber.toString();
    }
}