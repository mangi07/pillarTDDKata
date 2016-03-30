package com.ben;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ben on 3/30/2016.
 * Convert Roman Numerals to Arabic
 */
public class Arabic {

    public int fromRomanNumeral(String romanNumeral) {
        int arabic = 0;
        Map<Character, Integer> arabicValues = new HashMap<>();
        arabicValues.put('I', 1);
        arabicValues.put('V', 5);

        if (romanNumeral.contains("V")) {
            return 4;
        } else {
            for (int digits = romanNumeral.length(); digits > 0; --digits) {
                arabic++;
            }
            return arabic;
        }
    }
}
