import java.util.Properties;
import java.util.Set;

public class MapEx04 {
	public static void main(String[] args) {
		
		// System 클래스에서의 환경정보
		System.out.println( System.getProperty( "os.name" ) );
		
		Properties props = System.getProperties();
		Set<String> keys = props.stringPropertyNames();
		
		// System 환경정보
		for( String key : keys ) {
//			System.out.println( key );
		}
		
		System.out.println( System.getProperty( "java.runtime.version" ) );
	}
}
