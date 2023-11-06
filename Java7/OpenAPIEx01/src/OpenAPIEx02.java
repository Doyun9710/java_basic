import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class OpenAPIEx02 {

	public static void main(String[] args) {

		// JSON
		// http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916

		BufferedReader br = null;
		
		StringBuilder sbJson = new StringBuilder();
		try {
			URL url = new URL( "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

//			String line = null;
//			while( (line = br.readLine() ) != null ) {
//				sbJson.append( line.trim() );
//			}
//			System.out.println( sbJson );
			
			String line = br.readLine();
//			System.out.println( line );
			
			line = line.replaceAll( ",", "\n" );
			
			String[] lines = line.split( "\n" );
			for( String data : lines ) {
				if( data.trim().startsWith( "\"movieNm" ) ) {
					System.out.println( data.trim().split( ":" )[1].replaceAll( "\"", "" ) );
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
