package lynda.essentials.formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
	Calendar calendar = new GregorianCalendar();
	Calendar calendar2 = new GregorianCalendar(2013,0,31,5,26,36);
	Calendar calendar3 = new GregorianCalendar(2013,Calendar.NOVEMBER,30);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
	System.out.println("Employed date(today):" + sdf.format(calendar.getTime()));
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");	
	calendar.add(Calendar.MONTH, 3);
	System.out.println("Employment test expiry date(3months from now): " +sdf.format(calendar.getTime()));
	System.out.println(sdf.format(calendar3.getTime()));
	System.out.println(sdf2.format(calendar2.getTime()));
 
	System.out.println("year \t\t: " + calendar.get(Calendar.YEAR));
	System.out.println("month \t\t: " + calendar.get(Calendar.MONTH));
	System.out.println("dayOfMonth \t: " + calendar.get(Calendar.DAY_OF_MONTH));
	System.out.println("dayOfWeek \t: " + calendar.get(Calendar.DAY_OF_WEEK));
	System.out.println("weekOfYear \t: " + calendar.get(Calendar.WEEK_OF_YEAR));
	System.out.println("weekOfMonth \t: " + calendar.get(Calendar.WEEK_OF_MONTH));
 
	System.out.println("hour \t\t: " + calendar.get(Calendar.HOUR));
	System.out.println("hourOfDay \t: " + calendar.get(Calendar.HOUR_OF_DAY));
	System.out.println("minute \t\t: " + calendar.get(Calendar.MINUTE));
	System.out.println("second \t\t: " + calendar.get(Calendar.SECOND));
	System.out.println("millisecond \t: " + calendar.get(Calendar.MILLISECOND));	

	calendar.set(Calendar.MINUTE, 33);
	calendar.add(Calendar.MONTH, 3);
	System.out.println("#2. " + sdf.format(calendar.getTime()));
    }
}
