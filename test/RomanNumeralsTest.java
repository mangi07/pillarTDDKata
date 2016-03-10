import com.ben.RomanNumerals;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ben on 3/10/2016.
 */
public class RomanNumeralsTest {

    @Test
    public void whenRomanNumeralsIsPassedAOneItReturnsI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.arabicToRoman(1));
    }

    @Test
    public void whenArabicToRomanIsPassedATwoItReturnsII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("II", romanNumerals.arabicToRoman(2));
    }

    @Test
    public void whenArabicToRomanIsPassedAThreeItReturnsIII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("III", romanNumerals.arabicToRoman(3));
    }


}
