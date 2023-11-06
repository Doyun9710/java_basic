import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat( "yyyy년 MM월 dd일" );
		
		String strDate = format.format( new Date() );
		System.out.println( strDate );
	}

}
