package com.ben;


import java.util.ArrayList;
import java.util.List;

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

        int remainder;
        int numerator;
        List<RomanValues> romVals = new ArrayList<>();
        romVals.add(RomanValues.X);
        romVals.add(RomanValues.V);
        romVals.add(RomanValues.I);
        int prevRomIndex = 0;
        RomanValues prevRom = romVals.get(prevRomIndex);

        for (int romCount = 0; romCount < romVals.size(); ++romCount) {
            RomanValues currRom = romVals.get(romCount);

            remainder = arabicNumber % currRom.value;
            numerator = arabicNumber - remainder;
            arabicNumber = arabicNumber - numerator;
            int romNumCount = numerator / currRom.value;

            if (romNumCount <= 3 && romNumCount > 0) {
                for (int repeat = 0; repeat < romNumCount; ++repeat) {
                    romanNumber.append(currRom.symbol);
                }
                prevRomIndex = romCount;
                prevRom = romVals.get(prevRomIndex);
            } else if (romNumCount == 4) {
                if (romanNumber.length() > 0) {
                    romanNumber.deleteCharAt(romanNumber.length() - 1);
                }
                romanNumber.append(RomanValues.I.symbol);
                int stepBack = (prevRom.baseType == 5) ? 2 : 1;
                int index = romCount - stepBack;
                romanNumber.append(romVals.get(index).symbol);
            }

        }
        /*
        if (arabicNumber == 9) {
            romanNumber.append("IX");
            arabicNumber = arabicNumber - 9;
        }
        if (arabicNumber >= 5) {
            romanNumber.append("V");
            arabicNumber = arabicNumber - 5;
        }
        if (arabicNumber == 4) {
            romanNumber.append("IV");
        }
        if (arabicNumber < 4) {
            for (int i = 0; i < arabicNumber; ++i) {
                romanNumber.append("I");
            }
        }
        */

            return romanNumber.toString();
        }
    }
