/**
 * This program was created with the purpose of seeing the skills that the
 * programmer in question has, non-profit, for Stackbuilders Company.
 *
 * PeakNPlaque Predictor / Pico y Placa Predictor stackbuilders 2020 (c)
 *
 * @author Solange Pico
 */
package peaknplaque;

/**
 *
 * Class (predict) it will take the date, time to validate if car
 * can circulate.
 */
public class Predict {

    /**
     * String method, which returns Allowed or Not Allowed.
     *
     * @param plaque, format(ABC-0123).
     * @param dateTrip, format(yyy-MM-dd)
     * @param time, format(hh:mms).
     * @return Allowed or Not Allowed.
     *
     */
    DateTime dateC = new DateTime();
    DateTrip plaqueC = new DateTrip();

    public String plaqueAllowed(String plaque, String dateTrip, String time) {
        String lastDigit = plaque.charAt(plaque.length() - 1) + "";
        String result = "Allowed";
        if (!dateC.timeAllowed(time)) {
            String[] parts = plaqueC.dateAllowed(dateTrip).split("-");
            if (lastDigit.equals(parts[0]) || lastDigit.equals(parts[1])) {
                result = "Not Allowed";
            }
        }
        return result;
    }
}
