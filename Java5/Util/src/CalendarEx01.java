import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c1 = Calendar.getInstance();
		System.out.println( c1.toString() );

		System.out.println( c1.get( Calendar.YEAR ) );
		System.out.println( c1.get( Calendar.MONTH ) );
		System.out.println( c1.get( Calendar.DATE ) );
		
		// 일요일 : 1
		System.out.println( c1.get( Calendar.DAY_OF_WEEK ) );
		
		// DATE
		System.out.println( c1.getTime() );
		System.out.println( c1.getTimeInMillis() );
		
		// 마지막 날
		System.out.println( c1.getActualMaximum( Calendar.DATE ) );
	}

}
