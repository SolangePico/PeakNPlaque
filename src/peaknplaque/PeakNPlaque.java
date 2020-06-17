/**
 * This program was created with the purpose of seeing the skills that the
 * programmer in question has, non-profit, for Stackbuilders Company.
 *
 * PeakNPlaque Predictor / Pico y Placa Predictor stackbuilders 2020 (c)
 *
 * @author Solange Pico
 */
package peaknplaque;

import java.util.Scanner;

/**
 * Principal class to deploy the program.
 *
 */
public class PeakNPlaque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to 'Pico y Placa' predictor system");
        Scanner read = new Scanner(System.in);
        boolean answer = true;
        do {
            Predict pre = new Predict();

            System.out.println("\t\tPeak N Plaque");
            System.out.print("Plaque (AAA-0000): ");
            String plaque = read.next();
            System.out.print("Date (aaaa-MM-dd): ");
            String dateTrip = read.next();
            System.out.print("Hour (hh:mm): ");
            String time = read.next();

            System.out.println(pre.plaqueAllowed(plaque, dateTrip, time));
            System.out.print("Enter another plaque? y/n: ");
            String option = read.next();
            if (!option.toLowerCase().equals("y")) {
                answer = false;
            }
        } while (answer);
    }
}
