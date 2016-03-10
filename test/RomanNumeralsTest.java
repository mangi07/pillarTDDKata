import com.ben.RomanNumerals;
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
}
