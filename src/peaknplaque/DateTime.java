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
     * @param time, format(hh:mms).
     * @return isAllowHour or not.
     *
     */
    public boolean timeAllowed(String time) {
        boolean isAllowHour = true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");
        try {
            Calendar calendar = Calendar.getInstance();
            Date parsedTime = dateFormat.parse(time);
            calendar.setTime(parsedTime);

            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int min = calendar.get(Calendar.MINUTE);
            if ((hour >= 7 && hour <= 9) || (hour >= 16 && hour <= 19)) {
                if (hour == 9 || hour == 19) {
                    if (min >= 0 && min <= 30) {
                        isAllowHour = false;
                    }
                } else {
                    isAllowHour = false;
                }
            }
        } catch (ParseException e) {
            System.err.println("invalid Hour Format");
        }
        return isAllowHour;
    }
}
