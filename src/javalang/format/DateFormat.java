package javalang.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author ts-tuluv.battulga
 */
public class DateFormat {
    public static void main(String[] args) {
        String pattern = "yyyyMMdd";
        SimpleDateFormat fmt = new SimpleDateFormat(pattern);
        String arg = "20141031";
        try {
            if (arg.equals(fmt.format(fmt.parse(arg)))) {
                System.out.println("format success");
            }
            Date dStartDate = toDate(arg, pattern);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dStartDate);
            System.out.println("Parsed date:" + calendar.getTime());
        } catch (ParseException e) {
            System.out.println("error");
        }
    }

    public static Date toDate(String date, String pattern) {

        if (date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

}
