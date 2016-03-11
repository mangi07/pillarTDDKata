package com.ben;

import java.util.Map;

/**
 * Created by ben on 3/10/2016.
 */
public class RomanNumerals {

    /* https://dzone.com/articles/tdd-algorithms
     * ...hmm...implement Greedy algorithm already?
     * Would Greedy emerge from TDD, or is it okay
     * to implement the algorithm from the start
     * as long as the test covers all the Roman Numeral
     * conversion rules and all the tests pass? */

    public String arabicToRoman(Integer arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        if (arabicNumber == 4) {
            romanNumber.append("IV");
        } else if (arabicNumber < 4) {
            for (int i = 0; i < arabicNumber; ++i) {
                romanNumber.append("I");
            }
        }
        return romanNumber.toString();
    }
}
