/**
 * This program was created with the purpose of seeing the skills that the
 * programmer in question has, non-profit, for Stackbuilders Company.
 *
 * PeakNPlaque Predictor / Pico y Placa Predictor stackbuilders 2020 (c)
 *
 * @author Solange Pico
 */
package peaknplaque_test;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import peaknplaque.Predict;

/**
 * This unit tests help me to verify that the logic of the program is correct.
 *
 */
public class PeakNPlaque_Test {

    Predict predictTest = new Predict();

    public PeakNPlaque_Test() {
    }

    /**
     * Executed before each test. It is used to prepare the test environment
     * (e.g., read input data, initialize the class).
     */
    @Before
    public void executedBeforeEach() {
        System.out.println("@Before: executedBeforeEach");
    }

    /**
     * Executed after each test. It is used to cleanup the test environment
     * (e.g., delete temporary data, restore defaults).
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        System.out.println("@After: executedBAfterEach");
    }

    /**
     * Test method, Input plaque, date, time, Function "plaqueAllowed", result allowed.
     */
    @Test
    public void testPredictor1() {
        System.out.println("Peak N Plaque Allowed");
        String plaque = "ABC-1001";
        String date = "2020-06-15";
        String time = "10:00";
        String expResult = "Allowed";
        String result = predictTest.plaqueAllowed(plaque, date, time);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Test fail!");
        }
    }

    /**
     * Test method, Input plaque, date, time, Function "plaqueAllowed", result Not Allowed.
     */
    @Test
    public void testPredictor2() {
        System.out.println("Peak N Plaque Not Allowed");
        String plaque = "ABC-1003";
        String date = "2020-06-16";
        String time = "18:45";
        String expResult = "Not Allowed";
        String result = predictTest.plaqueAllowed(plaque, date, time);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("Test fail!");
        }
    }
}
