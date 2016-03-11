package com.ben;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 3/10/2016.
 */
public class RomanNumerals {

    /* https://dzone.com/articles/tdd-algorithms
     * ...hmm...I guess it was a little of both --
     * some foreknowledge of how the algorithm should look
     * but also letting it emerge with TDD.*/

    public String arabicToRoman(Integer arabicNumber) {
        StringBuilder romanNumber = new StringBuilder();

        int remainder;
        int numerator;
        List<RomanValues> romVals = new ArrayList<>();
        romVals.add(RomanValues.M);
        romVals.add(RomanValues.D);
        romVals.add(RomanValues.C);
        romVals.add(RomanValues.L);
        romVals.add(RomanValues.X);
        romVals.add(RomanValues.V);
        romVals.add(RomanValues.I);
        int prevRomIndex = 0;
        RomanValues prevRom = romVals.get(prevRomIndex);
        boolean pending = true;

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
                pending = true;
            } else if (romNumCount == 4) {
                if (romanNumber.length() > 0 && pending) {
                    romanNumber.deleteCharAt(romanNumber.length() - 1);
                }
                romanNumber.append(currRom.symbol);
                int stepBack = (prevRom.baseType == 5) ? 2 : 1;
                int index = romCount - stepBack;
                prevRom = romVals.get(index);
                romanNumber.append(prevRom.symbol);
                pending = false;
            }

        }

        return romanNumber.toString();
    }
}
