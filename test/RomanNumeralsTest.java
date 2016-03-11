import com.ben.RomanNumerals;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ben on 3/10/2016.
 */
public class RomanNumeralsTest {

    RomanNumerals romanNumerals;

    @Before
    public void setUp() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void whenRomanNumeralsIsPassedAOneItReturnsI() {
        assertEquals("I", romanNumerals.arabicToRoman(1));
    }

    @Test
    public void whenArabicToRomanIsPassedATwoItReturnsII() {
        assertEquals("II", romanNumerals.arabicToRoman(2));
    }

    @Test
    public void whenArabicToRomanIsPassedAThreeItReturnsIII() {
        assertEquals("III", romanNumerals.arabicToRoman(3));
    }

    @Test
    public void whenArabicToRomanIsPassedAFourItReturnsIV() {
        assertEquals("IV", romanNumerals.arabicToRoman(4));
    }

    @Test
    public void whenArabicToRomanIsPassedAnEightItReturnsVIII() {
        assertEquals("VIII", romanNumerals.arabicToRoman(8));
    }

    @Test
    public void whenArabicToRomanIsPassedANineItReturnsIX() {
        assertEquals("IX", romanNumerals.arabicToRoman(9));
    }

    @Test
    public void whenArabicToRomanIsPassedNinetyItReturnsXC() {
        assertEquals("XC", romanNumerals.arabicToRoman(90));
    }

    @Test
    public void whenArabicToRomanIsPassedNinetyFourItReturnsXCIV() {
        assertEquals("XCIV", romanNumerals.arabicToRoman(94));
    }

    @Test
    public void whenArabicToRomanIsPassedNineHundredFortyItReturnsCMXL() {
        assertEquals("CMXL", romanNumerals.arabicToRoman(940));
    }

    @Test
    public void whenArabicToRomanIsPassedNineHundredFortyNineItReturnsCMXLIX() {
        assertEquals("CMXLIX", romanNumerals.arabicToRoman(949));
    }

    @Test
    public void miscRemainingArabicToRoman() {
        assertEquals("MMMDCCCLXXXIX", romanNumerals.arabicToRoman(3889));
        assertEquals("MMMDCCCXC", romanNumerals.arabicToRoman(3890));
        assertEquals("MMMCMXCIX", romanNumerals.arabicToRoman(3999));
        assertEquals("CDLV", romanNumerals.arabicToRoman(455));
    }
}
