import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		URL url = new URL( "https://m.daum.net" );
//		URLConnection conn = url.openConnection();
		
		try {
			URLConnection conn = new URL( "https://m.daum.net" ).openConnection();
			
			System.out.println( conn );
			System.out.println( conn.getContentEncoding() );
			System.out.println( conn.getContentLength() );
			System.out.println( conn.getContentType() );
		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		}
	}

}
