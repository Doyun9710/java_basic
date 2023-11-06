import java.util.Properties;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 프로그램 환경설정 때 사용
		Properties pros = new Properties();
		
		
		// put
		pros.setProperty( "timeout", "30" );
		pros.setProperty( "language", "kr" );
		pros.setProperty( "size", "10" );
		
		System.out.println( pros );
		System.out.println( pros.size() );
		
		
		// get
		System.out.println( pros.getProperty( "timeout" ) );
		
		
		// names 출력
		Set<String> names = pros.stringPropertyNames();
		System.out.println( names );
	}

}
