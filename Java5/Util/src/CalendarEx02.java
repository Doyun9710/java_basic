import java.util.Calendar;
import java.util.Date;

public class CalendarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		
		c.set(2023, 8-1, 1);
		System.out.println( c.getTime() );
		
		// Calendar => Date
		Date d = c.getTime();
		System.out.println( d.toLocaleString() );
	}

}
