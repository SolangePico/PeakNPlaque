/**
 * This program was created with the purpose of seeing the skills that the
 * programmer in question has, non-profit, for Stackbuilders Company.
 *
 * PeakNPlaque Predictor / Pico y Placa Predictor stackbuilders 2020 (c)
 *
 * @author Solange Pico
 */
package peaknplaque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

/**
 * Class (DateTrip) take the date(yyyy-MM-dd) to determine the correct day to
 * circulate.
 */
public class DateTrip {

    /**
     * String method, which returns us if it is at the allowed time.
     *
     * @param dayTrip, it must to be in yyyy-MM-dd.
     * @return notAllowPlaque or not.
     *
     */
    public String dateAllowed(String dayTrip) {
        String day = null;
        String notAllowPlaque = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = dateFormat.parse(dayTrip);
            GregorianCalendar dayCalendar = new GregorianCalendar();
            dayCalendar.setTime(parsedDate);
            int weekDay = dayCalendar.get(Calendar.DAY_OF_WEEK);
            switch (weekDay) {
                case 1:
                    day = "Sunday";
                    notAllowPlaque = "none";
                    break;
                case 2:
                    day = "Monday";
                    notAllowPlaque = "1-2";
                    break;
                case 3:
                    day = "Tuesday";
                    notAllowPlaque = "3-4";
                    break;
                case 4:
                    day = "Wednesday";
                    notAllowPlaque = "5-6";
                    break;
                case 5:
                    day = "Thursday";
                    notAllowPlaque = "7-8";
                    break;
                case 6:
                    day = "Friday";
                    notAllowPlaque = "9-0";
                    break;
                case 7:
                    day = "Saturday";
                    notAllowPlaque = "none";
                    break;
            }
        } catch (ParseException e) {
            System.err.println("invalid Date Format");
        }
        return notAllowPlaque;
    }
}
