import java.util.Date;

public class DateEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		
		// Timestamp
		System.out.println( d.getTime() );
		System.out.println( System.currentTimeMillis() );
		
		
		Date d2 = new Date( System.currentTimeMillis() );
		System.out.println( d.toLocaleString() );
		
		
		// 시간 차
		// System.out.println( d - d2 );	// error
		System.out.println( d.getTime() - d2.getTime() );
	}

}
