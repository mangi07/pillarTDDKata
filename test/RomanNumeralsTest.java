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
}
