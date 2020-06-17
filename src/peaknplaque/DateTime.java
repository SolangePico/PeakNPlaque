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
import java.util.Date;

/**
 * Class (time) to determine if car is in the allowed range to circulate in
 * Quito.
 */
public class DateTime {

    /**
     * Boolean method, which returns us if it is at the allowed time.
     *
     * @param time, it must to be in hh:mm.
     * @return isAllowHour or not.
     *
     */
    public boolean timeAllowed(String time) {
        boolean isAllowHour = true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
        try {
            Calendar calendar = Calendar.getInstance();
            Date parsedDate = dateFormat.parse(time);
            calendar.setTime(parsedDate);

            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int min = calendar.get(Calendar.MINUTE);
            if ((hour >= 7 && min >= 00) && (hour <= 9 && min <= 30)) {
                isAllowHour = false;
            }
            if ((hour >= 16 && min >= 00) && (hour <= 19 && min <= 30)) {
                isAllowHour = false;
            }
        } catch (ParseException e) {
            System.err.println("invalid Hour Format");
            e.printStackTrace();
        }
        return isAllowHour;
    }
}
