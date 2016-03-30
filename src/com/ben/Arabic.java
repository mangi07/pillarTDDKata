package com.ben;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        arabicValues.put('X', 10);
        arabicValues.put('L', 50);
        arabicValues.put('C', 100);
        arabicValues.put('D', 500);
        arabicValues.put('M', 1000);

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < romanNumeral.length(); i++) {
            char c = romanNumeral.charAt(i);
            values.add(arabicValues.get(c));
        }

        int prev, curr;
        prev = arabicValues.get(romanNumeral.charAt(0));
        for (int digit : values) {
            curr = digit;
            if (prev >= curr) {
                arabic += curr;
            } else if (prev < curr){
                arabic = arabic - prev + (curr - prev);
            }
            prev = curr;
        }

        return arabic;
    }
}
