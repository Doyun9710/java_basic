import java.util.Calendar;

public class CalendarEx05 {
	public static void main(String[] args) {
		
		int year = 2023;
		int month = 8;
		
		Calendar startCalendar = Calendar.getInstance();
		Calendar endCalendar = Calendar.getInstance();
		
		startCalendar.set(year, month-1, 1);
		endCalendar.set(year, month, 1-1);
		
		int startDayOfWeek = startCalendar.get( Calendar.DAY_OF_WEEK );
		int endDate = startCalendar.get( Calendar.DAY_OF_WEEK );
		
		for( int i=1 ; i<startDayOfWeek ; i++ ) {
			System.out.println("    ");
		}
		
		for( int i=1, n=startDayOfWeek ; i<=endDate ; i++, n++ ) {
			System.out.println( (i<10) ? "  " + i : " " + i );
			if( n % 7 == 0) {
				System.out.println();
			}
		}
	}
}
