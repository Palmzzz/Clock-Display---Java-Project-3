
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Milan Palmer
 */
public class ClockDisplayTest
{
    /**
     * Default constructor for test class ClockDisplayTest
     */
    public ClockDisplayTest(){
    }

    @Test
    public void clockDisplayConstructor(){
        ClockDisplay display = new ClockDisplay();
        NumberDisplay seconds = display.getSecondsDisplay();
        int secondsValue = seconds.getValue();
        assertEquals(0, secondsValue);
        NumberDisplay minutes = display.getMinutesDisplay();
        int minutesValue = minutes.getValue();
        assertEquals(0, minutesValue);
        NumberDisplay hours = display.getHoursDisplay();
        int hoursValue = hours.getValue();
        assertEquals(0, hoursValue);
    }        

    
    @Test
    public void timeTickTest() {
        ClockDisplay cd = new ClockDisplay();
        cd.timeTick();
        assertEquals(1, cd.getMinutesDisplay().getValue());
        assertEquals(0, cd.getHoursDisplay().getValue());
        cd.timeTick();
        assertEquals(2, cd.getMinutesDisplay().getValue());
        assertEquals(0, cd.getHoursDisplay().getValue());

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
