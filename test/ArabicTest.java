import com.ben.Arabic;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

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
        assertEquals(number, 1);
    }

    @Test
    public void whenPassedIIIReturns3() {
        int number = arabic.fromRomanNumeral("III");
        assertEquals(number, 3);
    }
}
