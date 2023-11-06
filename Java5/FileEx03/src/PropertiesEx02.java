import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream( "./config.prperties" );
			
			Properties props = new Properties();
			props.load( fis );
			
			Set<String> keys = props.stringPropertyNames();
			for( String key : keys ) {
				System.out.println( key + " : " + props.getProperty(key) );
			}
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fis != null ) try { fis.close(); } catch(IOException e) {}
		}
	}

}
