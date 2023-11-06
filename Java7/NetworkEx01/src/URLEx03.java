import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx03 {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		
		try {
			URL url = new URL( "https://m.daum.net" );
			isr = new InputStreamReader( url.openStream() );
			
			int data = 0;
			while( ( data = isr.read() ) != -1 ) {
				System.out.print( (char)data );
			}
		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( isr != null ) try { isr.close(); } catch(IOException e) {}
		}
	}

}
