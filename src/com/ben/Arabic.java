package com.ben;

/**
 * Created by ben on 3/30/2016.
 * Convert Roman Numerals to Arabic
 */
public class Arabic {

    public int fromRomanNumeral(String romanNumeral) {
        int arabic = 0;
        for (int digits = romanNumeral.length(); digits > 0; --digits) {
            arabic++;
        }
        return arabic;
    }
}
