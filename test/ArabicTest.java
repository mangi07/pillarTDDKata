import com.ben.Arabic;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ben on 3/30/2016.
 */
public class ArabicTest {

    Arabic arabic;

    @Before
    public void setUp() {
        arabic = new Arabic();
    }

    @Test
    public void whenPassedIReturns1() {
        int number = arabic.fromRomanNumeral("I");
        assertEquals(1, number);
    }

    @Test
    public void whenPassedIIIReturns3() {
        int number = arabic.fromRomanNumeral("III");
        assertEquals(3, number);
    }

    @Test
    public void whenPassedIVReturns4() {
        int number = arabic.fromRomanNumeral("IV");
        assertEquals(4, number);
    }

    @Test
    public void whenPassedVReturns5() {
        int number = arabic.fromRomanNumeral("V");
        assertEquals(5, number);
    }

    @Test
    public void whenPassedVIIReturns7() {
        int number = arabic.fromRomanNumeral("VII");
        assertEquals(7, number);
    }

    @Test
    public void whenPassedIXReturns9() {
        int number = arabic.fromRomanNumeral("IX");
        assertEquals(9, number);
    }

    @Test
    public void whenPassedXIVReturns14() {
        int number = arabic.fromRomanNumeral("XIV");
        assertEquals(14, number);
    }

    @Test
    public void whenPassedXVIReturns16() {
        int number = arabic.fromRomanNumeral("XVI");
        assertEquals(16, number);
    }


}
