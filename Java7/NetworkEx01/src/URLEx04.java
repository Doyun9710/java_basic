import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx04 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			URL url = new URL( "https://m.daum.net" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

			String line = null;
			while( (line = br.readLine() ) != null ) {
				System.out.println( line );
			}
		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
