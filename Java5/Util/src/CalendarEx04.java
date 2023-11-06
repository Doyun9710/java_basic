import java.util.Calendar;

public class CalendarEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		c1.set(2023, 8-1, 1);
		String[] dayNames = { "일", "월", "화", "수", "목", "금", "토" };
		
		for(int i=0 ; i<7 ; i++) {
			System.out.print(dayNames[i] + "\t");
		}
		
		int count = -1;
		for( int i=1 ; i<=c.getActualMaximum( Calendar.DATE ) ; i++ ) {
//			System.out.println(c1.get( Calendar.DAY_OF_WEEK));
			count += c1.get( Calendar.DAY_OF_WEEK);
			if( count > 7 ) {
				System.out.println();
				count = -1;
			}
			
			count++;
		}
	}

}
