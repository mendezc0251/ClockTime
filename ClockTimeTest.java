

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clockTim1 = new ClockTime(11, 00, 00);
        clockTim2 = new ClockTime(11, 00, 00);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testToString()
    {
        ClockTime clockTim2 = new ClockTime(11, 00, 00);
        assertEquals("11:00:00 A.M.", clockTim2.toString12());
    }


    @Test
    public void testtoString()
    {
        ClockTime clockTim1 = new ClockTime(11, 00, 00);
        assertEquals("11:00:00", clockTim1.toString());
    }

    @Test
    public void testHour()
    {
        ClockTime clockTim1 = new ClockTime(11, 00, 00);
        assertEquals(11, clockTim1.getHour());
    }

    @Test
    public void testEquals()
    {
        clockTim1.equals(clockTim2);
    }
}







