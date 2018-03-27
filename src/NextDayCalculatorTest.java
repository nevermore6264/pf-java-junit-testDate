import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @Disabled("Test 01/01/2018 = 02/01/2018")
    void testDay() {
        String tomorow = NextDayCalculator.testDay(01, 01, 2018);
        assertEquals("2/1/2018", tomorow);
    }

    @Test
    @Disabled("Test  31/01/2018 = 01/02/2018")
    void testJun() {
        String tomorow = NextDayCalculator.testMonth(31, 1, 2018);
        assertEquals("1/2/2018", tomorow);
    }

    @Test
    @Disabled("Test 2016 = true")
    void testYear() {
        boolean result = NextDayCalculator.checkYear(2016);
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    @Disabled("Test  28/02/2018 = 01/03/2018")
    void testFeb() {
        String tomorow = NextDayCalculator.testMonth(28, 2, 2018);
        assertEquals("1/3/2018", tomorow);
    }

    @Test
    @Disabled("Test  29/02/2016 = 01/03/2016")
    void testFeb2() {
        String tomorow = NextDayCalculator.testMonth(29, 2, 2016);
        assertEquals("1/3/2016", tomorow);
    }

    @Test
    @Disabled("Test  2  30/06/2018 = 01/02/2018")
    void testJun2() {
        String tomorow = NextDayCalculator.testMonth(30, 06, 2018);
        assertEquals("1/7/2018", tomorow);
    }
}