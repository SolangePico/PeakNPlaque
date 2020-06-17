/**
 * This program was created with the purpose of seeing the skills that the
 * programmer in question has, non-profit, for Stackbuilders Company.
 *
 * PeakNPlaque Predictor / Pico y Placa Predictor stackbuilders 2020 (c)
 *
 * @author Solange Pico
 */
package peaknplaque_test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This test runner access to PeakNPlaque class to run all test methods.
 * 
 */
public class TestRunner {

    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(PeakNPlaque_Test.class);

        result.getFailures().stream().forEach((failure) -> {
            System.out.println(failure.toString());
        });
        System.out.println(result.wasSuccessful());
    }
}
