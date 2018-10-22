package javalang.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author ts-tuluv.battulga
 */
public class CalendarTest {

    public static void main(String[] args) {
        CalendarTest calendarTest = new CalendarTest();
        LocalDate targetDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(dtf.format(targetDate));
    }
}
