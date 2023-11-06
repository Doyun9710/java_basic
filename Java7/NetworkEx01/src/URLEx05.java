import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx05 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			URL url = new URL( "https://news.daum.net" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

			String line = null;
			boolean flag = false;
			boolean flag1 = false;
			while( (line = br.readLine() ) != null ) {
				if( line.contains( "<ul class=\"list_newsissue\">" ) ) {
					flag = true;
				}
				
				if( line.contains( "</ul>" ) ) {
					flag = false;
				}
				
				if( flag ) {
//					System.out.println( line );
					if( line.contains( "</a>" ) ) {
						flag1 = false;
					} else if( line.contains( "<img" ) ) {
						flag1 = false;
					}
					
					if( flag1 ) {
						System.out.println( line );
					}
					
					if( line.contains( "<a href=" ) ) {
						flag1 = true;
					}
				}
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
