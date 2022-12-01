

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Milan Palmer
 */
public class NumberDisplayTest
{
    /**
     * Default constructor for test class NumberDisplayTest
     */
    public NumberDisplayTest()
    {
    }
    
    @Test
    public void constructorTest(){
        NumberDisplay numDisp = new NumberDisplay(3);
        assertEquals(3, numDisp.getLimit());
        assertEquals(0, numDisp.getValue());
    }

    @Test
    public void incrementTest() {
        NumberDisplay numDisp = new NumberDisplay(3);
        assertEquals(0, numDisp.getValue());
        assertEquals(3, numDisp.getLimit());
        numDisp.increment();
        assertEquals(1, numDisp.getValue());
        numDisp.increment();
        assertEquals(2, numDisp.getValue());
        numDisp.increment();
        assertEquals(0, numDisp.getValue());
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
