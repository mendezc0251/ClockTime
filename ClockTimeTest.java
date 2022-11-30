

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
    public void test24ToString()
    {
        ClockTime clockTim1 = new ClockTime(13, 00, 00);
        assertEquals("13:00:00", clockTim1.toString());
    }
}


