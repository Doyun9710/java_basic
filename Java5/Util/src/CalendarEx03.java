import java.util.Calendar;

public class CalendarEx03 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println( c.getTime().toLocaleString() );
		
		// 날짜 변경
		c.add( Calendar.DATE, 1);
		System.out.println( c.getTime().toLocaleString() );
		
		c.add( Calendar.MONTH, -6 );
		System.out.println( c.getTime().toLocaleString() );
	}
}
